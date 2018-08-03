package me.bright.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Component
public class UserService {

  @Autowired private UserRepository userRepository;

  public void save(User user) {
    userRepository.save(user);
  }

  public List<User> findAll() {
    Iterable<User> users = userRepository.findAll();
    return StreamSupport.stream(users.spliterator(), false).collect(Collectors.toList());
  }

  public Optional<User> findById(int id) {
    return userRepository.findById(id);
  }
}
