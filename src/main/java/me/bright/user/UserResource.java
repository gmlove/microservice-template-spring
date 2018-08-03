package me.bright.user;

import me.bright.common.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

@Controller
@RequestMapping(path = "/demo")
public class UserResource {

  @Autowired
  private UserService userService;

  @PostMapping(path = "/users")
  @ResponseBody
  public String addNewUser(@ModelAttribute UserDto userDto) {
    User user = new User();
    user.setName(userDto.name);
    user.setEmail(userDto.email);
    userService.save(user);
    return user.getId().toString();
  }

  @GetMapping(path = "/users")
  @ResponseBody
  public Iterable<User> getAllUsers() {
    return userService.findAll();
  }

  @GetMapping(path = "/users/{id}")
  @ResponseBody
  public User getAllUser(@PathVariable Integer id) {
    Optional<User> user = userService.findById(id);
    if (!user.isPresent()) {
      throw new ResourceNotFoundException();
    }
    return user.get();
  }

}
