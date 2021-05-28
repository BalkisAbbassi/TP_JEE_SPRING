package com.epi.miniproject.service;

import com.epi.miniproject.dao.entity.Compte;
import com.epi.miniproject.dao.repository.CompteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompteServiceImpl implements  CompteService{

    @Autowired
    private CompteRepository compteRepository;

    @Override
    public void addCompte(Compte compte) {
        compteRepository.save(compte);
    }

    @Override
    public void updateCompte(Compte compte) {
        if (compte != null){
            Optional<Compte> compteFromDB = compteRepository.findById(compte.getId());
            if (compteFromDB.isPresent()){
                compteRepository.save(compte) ;
            }
        }
    }

    @Override
    public void deleteCompte(Long id) {
        if (id != null){
            compteRepository.deleteById(id);
        }

    }

    @Override
    public List<Compte> getAll() {
        return compteRepository.findAll() ;
    }

}
