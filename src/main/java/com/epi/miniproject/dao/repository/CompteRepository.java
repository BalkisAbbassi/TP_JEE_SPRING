package com.epi.miniproject.dao.repository;

import com.epi.miniproject.dao.entity.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteRepository extends JpaRepository<Compte, Long> {

}
