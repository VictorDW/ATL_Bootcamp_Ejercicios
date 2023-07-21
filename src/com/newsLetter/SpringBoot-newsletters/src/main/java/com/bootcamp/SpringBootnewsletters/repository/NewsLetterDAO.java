package com.bootcamp.SpringBootnewsletters.repository;

import com.bootcamp.SpringBootnewsletters.entity.Leads;

import java.util.List;


public interface NewsLetterDAO {

   List<Leads> getEmail();

   boolean registrarEmail(Leads leads);

   boolean eliminarEmail(String emailDesuscripto);

   boolean existeEmail(String email);
}
