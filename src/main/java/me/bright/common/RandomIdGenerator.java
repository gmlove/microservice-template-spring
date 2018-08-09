package me.bright.common;

import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class RandomIdGenerator {

  public String generate() {
    return UUID.randomUUID().toString();
  }
}
