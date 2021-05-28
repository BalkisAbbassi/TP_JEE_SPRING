package com.epi.miniproject.dao.repository;

import com.epi.miniproject.dao.entity.Banque;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BanqueRepository extends JpaRepository<Banque, Long> {
}
