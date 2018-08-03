package me.bright.user;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class UserServiceTest {
  @InjectMocks
  private UserService userService;
  @Mock
  private UserRepository userRepository;

  @Before
  public void setUp() {
    MockitoAnnotations.initMocks(this);
  }

  @Test
  public void should_saveUser_success() {
    User user = new User();
    userService.save(user);

    verify(userRepository, times(1)).save(user);
  }

  @Test
  public void should_findAll_success() {
    User user = new User();
    when(userRepository.findAll()).thenReturn(Arrays.asList(user));

    List<User> users = userService.findAll();
    assertThat(users.size(), equalTo(1));
    assertThat(users.get(0), is(user));
  }
}