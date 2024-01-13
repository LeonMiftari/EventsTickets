package com.example.events.repository;


import com.example.events.entity.EventOrganizer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventOrganizerRepository extends  JpaRepository<EventOrganizer, Long>  {
}
