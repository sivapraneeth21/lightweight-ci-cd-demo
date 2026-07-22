package com.demo;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
class BuildInfoTest {
  @Test
  void applicationNameIsCorrect() {
    assertEquals("Incorrect Application Name", BuildInfo.applicationName());
  }
}
