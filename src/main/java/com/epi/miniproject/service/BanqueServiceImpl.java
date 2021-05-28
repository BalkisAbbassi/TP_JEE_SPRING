package com.epi.miniproject.service;

import com.epi.miniproject.dao.entity.Banque;
import com.epi.miniproject.dao.repository.BanqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BanqueServiceImpl implements  BanqueService{

    @Autowired
    private BanqueRepository banqueRepository;

    @Override
    public void addBanque(Banque banque) {
        banqueRepository.save(banque);

    }

    @Override
    public void updateBanque(Banque banque) {
        if (banque != null ){
            Optional<Banque> banqueFromDB =banqueRepository.findById(banque.getId());
            if (banqueFromDB.isPresent()){
                banqueRepository.save(banque);
            }
        }
    }

    @Override
    public void deleteBanque(Long id) {
        if (id != null){
            banqueRepository.deleteById(id);
        }

    }

    @Override
    public List<Banque> getAll() {
        return banqueRepository.findAll();
    }
}
