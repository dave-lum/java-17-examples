package example.java17;

import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

public class _8_StreamToListTest {
  @Test
  public void testStreamToList() {
    List<String> list = Stream.of("alpha", "beta", "gamma").toList();
  }
}
