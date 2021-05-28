package com.epi.miniproject.dao.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Banque {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true)
    private Integer codeBanque;

    private String nomBanque;
    private String adresse;
    private Integer nb_agences;

    @OneToMany//(mappedBy = "banqueid", cascade = CascadeType.ALL)
    private List<Client> client;


}