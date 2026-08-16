package com.demo;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
class BuildInfoTest {
  @Test
  void applicationNameIsCorrect() {
    assertEquals("Lightweight CI/CD ", BuildInfo.applicationName());
  }
}
