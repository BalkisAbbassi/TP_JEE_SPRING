package com.epi.miniproject.dao.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
public class Compte {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(unique = true)
    private Integer num_Compte;

    private Date Date_Creation;
    private String type_Compte;
    private Float solde;

    @ManyToOne
    //@JoinColumn(name = "clientid")
    private Client client;



}
