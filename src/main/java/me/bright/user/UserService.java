package me.bright.user;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {

  @Autowired private UserRepository userRepository;

  public void save(User user) {
    userRepository.save(user);
  }

  public List<User> findAll() {
    Iterable<User> users = userRepository.findAll();
    return StreamSupport.stream(users.spliterator(), false)
        .collect(Collectors.toList());
  }
}
