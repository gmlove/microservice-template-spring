package me.bright.common.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
public class SystemError extends RuntimeException {

  public SystemError(String message) {
    super(message);
  }
}
