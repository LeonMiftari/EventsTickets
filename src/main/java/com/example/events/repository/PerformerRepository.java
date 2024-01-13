package com.example.events.repository;

import com.example.events.entity.Performers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PerformerRepository extends  JpaRepository<Performers, Long>  {
}
