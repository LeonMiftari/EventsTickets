package com.example.events.repository;

<<<<<<< HEAD:src/test/java/com/example/events/repository/EventRepositoryTest.java
public class EventRepositoryTest {
=======
import com.example.events.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface UserRepository extends  JpaRepository<User, Long>  {
>>>>>>> 18641aa8193cf1d53e3dbf5d0c758978fbdb2695:src/main/java/com/example/events/repository/UserRepository.java
}
