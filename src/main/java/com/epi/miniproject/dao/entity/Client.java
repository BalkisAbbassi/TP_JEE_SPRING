package com.epi.miniproject.dao.entity;


import lombok.Data;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;
import java.util.List;

@Data
@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nom;
    private String prenom;

    @Column(unique = true)
    private Integer cin;

    private Date DateN;
    private String email;
    private Integer telephone;

    @OneToMany //(mappedBy = "clientid", cascade = CascadeType.ALL)
    private List<Compte> compteList;

    @ManyToOne
   //@JoinColumn(name = "banqueid")
    private Banque banque;

}
