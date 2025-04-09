package sk.posam.fsa.jpa_repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sk.posam.fsa.model.User;

import java.util.Optional;

public interface JpaUserRepo extends JpaRepository<User , Long> {
    Optional<User> findByEmail(String email);
}
