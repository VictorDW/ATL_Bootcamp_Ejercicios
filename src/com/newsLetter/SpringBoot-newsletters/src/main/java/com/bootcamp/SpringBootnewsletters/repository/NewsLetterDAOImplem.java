package com.bootcamp.SpringBootnewsletters.repository;

import com.bootcamp.SpringBootnewsletters.entity.Leads;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public class NewsLetterDAOImplem implements NewsLetterDAO{

    @PersistenceContext
    EntityManager entityManager;

    @Transactional
    @Override
    public List<Leads> getEmail() {
        String query = "FROM Leads";
        return entityManager.createQuery(query).getResultList();
    }

    @Transactional
    @Override
    public boolean existeEmail(String email) {

        List<Leads> lead;
        String query = "FROM Leads WHERE email = :email";

        lead = entityManager.createQuery(query)
                .setParameter("email",email)
                .getResultList();

        if (lead.isEmpty()) return false;

        return true;
    }

    @Override
    public boolean registrarEmail(Leads leads) {

        if (!existeEmail(leads.getEmail())) {
            String query = "INSERT INTO Leads (email) VALUES (:email)";
            entityManager.createQuery(query)
                    .setParameter("email",leads.getEmail())
                    .executeUpdate();
            //entityManager.createNativeQuery(query).executeUpdate();
            return true;
        }
        return false;
    }

    @Transactional
    @Override
    public boolean eliminarEmail(String emailDesuscripto) {

        if (existeEmail(emailDesuscripto)) {
            String query = "DELETE FROM Leads WHERE email = :email";
            entityManager.createQuery(query)
                    .setParameter("email", emailDesuscripto)
                    .executeUpdate();

            return true;
        }
        return false;
    }




}
