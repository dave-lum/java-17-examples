package example.java17;

import org.junit.jupiter.api.Test;

public class _6_PatternMatchingTest {
  @Test
  public void testPatternMatchingInInstanceOf() {
    Object o = getObject();

    if (o instanceof String s) {
      print("Length is " + s.length());
    }

    if (o instanceof String s && s.length() > 100) {
      print("A long string");
    }
  }

  @Test
  public void testPatternMatchingInSwitch() {
    Object o = 123L;

    // Not allowed since this is only a language preview in Java 17, not final:

//    boolean isLong = switch (o) {
//      case null -> false;
//      case String s -> s.length() > 100;
//      case List lst -> lst.size() > 100;
//      default -> false;
//    };
  }

  private void print(String msg) {
    System.out.println(msg);
  }

  private Object getObject() {
    return "foo";
  }
}
