package me.bright.common;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsNot.not;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class RandomIdGeneratorTest {

  @Test
  public void should_generate_random_key() {
    assertThat(new RandomIdGenerator().generate(), not(equalTo("")));
  }

}