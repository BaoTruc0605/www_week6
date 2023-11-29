package vn.edu.iuh.fit.www_week6_tranbaotruc.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.www_week6_tranbaotruc.backend.models.User;
import vn.edu.iuh.fit.www_week6_tranbaotruc.backend.repositories.UserRepository;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public Optional<User> findByEmailAndPasswordHash(String email, String passwordHash){
        return userRepository.findUserByEmailAndPasswordHash(email,passwordHash);
    }
    public Optional<User> findById(long id){
        return userRepository.findById(id);
    }


}
