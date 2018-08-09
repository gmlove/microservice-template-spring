package me.bright.common;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import java.time.ZoneId;
import java.util.Calendar;

public class DateTimeTest {

  @Test
  public void should_generate_current_datetime() {
    assertThat(new DateTime().now().atZone(ZoneId.systemDefault()).toEpochSecond(),
        equalTo(Calendar.getInstance().getTimeInMillis() / 1000));
  }
}