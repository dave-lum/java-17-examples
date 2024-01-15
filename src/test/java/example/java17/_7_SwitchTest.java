package example.java17;

import static example.java17.Util.print;

import org.junit.jupiter.api.Test;

public class _7_SwitchTest {
  private enum Color {RED, GREEN, BLUE, PURPLE};

  @Test
  public void testSwitchExpression() {
    Color color = getColor();

    String feeling = switch(color) {
      case RED -> "Angry";
      case GREEN -> "Natural";
      case BLUE -> "Sad";
      case PURPLE -> "No Idea!"; // Required by the compiler, which is new in post-Java-8 and welcomed!
    };

    print(feeling);
  }

  @Test
  public void testYield() {
    Color color = getColor();

    boolean isCold = switch(color) {
      case RED -> {
        String msg = "Red is hot, not cold";
        print(msg);
        yield false; // Instead of `return`
      }
      case GREEN, BLUE, PURPLE -> {
        String msg = "Yep, these are cold colors"; // Doesn't collide with `msg` above :)
        print(msg);
        yield true;
      }
    };

    print("RED is cold? " + isCold);
  }

  private Color getColor() {
    return Color.BLUE;
  }
}
