package app.Services;

import app.Model.User;
import app.Repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class UserService {

    private UserRepository userRepository;
    private PasswordEncoder passwordEncoder;


    public Optional<User>  findByUsernameOrEmail(String identifier) {
        return userRepository.findUserByUsername(identifier).or(() -> userRepository.findByEmail(identifier));
    }

    public User saveUser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }
}
