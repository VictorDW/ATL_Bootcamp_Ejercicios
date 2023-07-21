package com.bootcamp.SpringBootnewsletters.entity;

import lombok.Data;
import jakarta.persistence.*;

@Data
@Entity
@Table(name = "leads")
public class Leads {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name="email")
    private String email;
}
