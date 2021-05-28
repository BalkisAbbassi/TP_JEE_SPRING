package com.epi.miniproject.service;

import com.epi.miniproject.dao.entity.Compte;

import java.util.List;

public interface CompteService {

    void addCompte(Compte compte);
    void updateCompte(Compte compte);
    void deleteCompte(Long id);

    List<Compte> getAll() ;
}
