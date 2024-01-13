package com.example.events.repository;

import com.example.events.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends  JpaRepository<Client, Long>  {
}
