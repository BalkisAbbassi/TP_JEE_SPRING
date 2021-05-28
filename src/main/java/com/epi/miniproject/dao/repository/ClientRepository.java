package com.epi.miniproject.dao.repository;

import com.epi.miniproject.dao.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
