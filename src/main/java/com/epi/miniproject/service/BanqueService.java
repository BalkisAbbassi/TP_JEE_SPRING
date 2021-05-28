package com.epi.miniproject.service;

import com.epi.miniproject.dao.entity.Banque;
import com.epi.miniproject.dao.entity.Client;

import java.util.List;

public interface BanqueService {
    void addBanque (Banque banque);
    void updateBanque(Banque banque);
    void deleteBanque(Long id);

    List<Banque> getAll();
}
