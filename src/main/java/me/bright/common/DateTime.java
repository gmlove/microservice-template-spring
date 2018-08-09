package me.bright.common;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class DateTime {

  public LocalDateTime now() {
    return LocalDateTime.now();
  }
}
