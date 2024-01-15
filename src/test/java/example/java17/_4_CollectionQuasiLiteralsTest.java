package example.java17;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.jupiter.api.Test;

public class _4_CollectionQuasiLiteralsTest {
  @Test
  public void testCollectionQuasiLiterals() {
    List<Integer> ints = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);

    Set<String> names = Set.of("John", "Paul", "George", "Ringo");

    Map<String, Integer> presToYear = Map.of(
      "Nixon", 1969,
      "Ford", 1974,
      "Carter", 1977,
      "Reagan", 1981,
      "Bush (HW)", 1989,
      "Clinton", 1993,
      "Bush (W)", 2001,
      "Obama", 2009,
      "Trump", 2017,
      "Biden", 2021
    );
  }

  @Test
  public void testNullItemInList() {
    assertThrows(NullPointerException.class, () ->
        List.of("Sung Joon", null));
  }

  @Test
  public void testNullItemInSet() {
    assertThrows(NullPointerException.class, () ->
        Set.of("Sung Joon", null));
  }

  @Test
  public void testNullKeyInMap() {
    assertThrows(NullPointerException.class, () ->
        Map.of(
            "Sung Joon", "Park",
            null, "Whoever"));
  }

  @Test
  public void testDuplicateKeyInMap() {
    assertThrows(IllegalArgumentException.class, () ->
        Map.of(
            "Dave", "Lum",
            "Dave", "Lum")); // Whoops, same key twice!
  }
}
