package example.java17;

import java.util.Optional;

import org.junit.jupiter.api.Test;

public class _11_OptionalTest {
  @Test
  public void testOptionalOrElseThrow() {
    Optional<String> someOptionalString = Optional.empty();

    String someString = someOptionalString.orElseThrow(); // Just makes it clear what `get()` has always done
  }
}
