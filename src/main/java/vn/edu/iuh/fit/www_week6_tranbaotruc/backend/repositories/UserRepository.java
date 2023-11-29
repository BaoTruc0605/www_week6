package vn.edu.iuh.fit.www_week6_tranbaotruc.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.iuh.fit.www_week6_tranbaotruc.backend.models.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {
    Optional<User> findUserByEmailAndPasswordHash(String email, String passwordHash);
//    findByEmailAndPasswordHash(String email, String passwordHash);
}
