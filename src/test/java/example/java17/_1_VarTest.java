package example.java17;

import java.io.FileOutputStream;
import java.util.Map;

import org.junit.jupiter.api.Test;

public class _1_VarTest {
  @Test
  public void testVar() throws Exception {
    // Local variables:
    var myString = "One Hundred Twenty Three";
    var myInt = 123;
    var myMap = Map.of("One", 1, "Two", 2, myString, myInt);

    // For loops:
    for (var stringKey : myMap.keySet()) {
      System.out.println(stringKey);
    }

    // Try with resources:
    try (var myFile = new FileOutputStream("/tmp/foo.txt")) {
      myFile.write(123);
    }

    // And some other places. Just try relaxing "String s" to "var s" when you see it

    // But maybe don't blindly use it everywhere! See https://openjdk.org/projects/amber/guides/lvti-style-guide
  }
}
