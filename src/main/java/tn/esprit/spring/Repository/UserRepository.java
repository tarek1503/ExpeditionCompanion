package tn.esprit.spring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.esprit.spring.Entities.User;


public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
    

    
    
}
