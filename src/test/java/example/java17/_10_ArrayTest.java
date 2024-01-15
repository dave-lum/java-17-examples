package example.java17;

import java.util.List;

import org.junit.jupiter.api.Test;

public class _10_ArrayTest {
  @Test
  public void testListToArray() {
    List<String> nameParts = List.of("Sarah", "Janet", "Maas");

    String[] namePartsAsArrayTheOldWay = nameParts.toArray(new String[0]); // Always feels stoopid!

    String[] namePartsAsArray = nameParts.toArray(String[]::new); // Feels better, one less memory allocation!
  }
}
