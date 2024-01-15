package example.java17;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class _2_TextBlockTest {
  public static void main(String[] args) throws Exception {
  }

  @Test
  public void demoMultiline() {
    String actualJson = "...";
    // Gone is this monstrosity from MiningDataSemanticJsonGeneratorTest.java:
    assertEquals("[{\"idx\":0,\"nAame\":\"testAction\",\"semantic\":\"Action\"},{\"idx\":1,\"name\":\"testCaseId\",\"semantic\":\"Case ID\"},{\"idx\":2,\"name\":\"testStart\",\"semantic\":\"Start\",\"format\":\"yyyy-MM-dd hh:mm::ss.SSS\"}]", actualJson);

    // Instead:
    assertEquals("""
      [
        {
          "idx": 0,
          "nAame": "testAction",
          "semantic": "Action"
        },
        {
          "idx": 1,
          "name": "testCaseId",
          "semantic": "Case ID"
        },
        {
          "idx": 2,
          "name": "testStart",
          "semantic": "Start",
          "format": "yyyy-MM-dd hh:mm::ss.SSS"
        }
      ]""",
      actualJson); // Although, massaging of the actual JSON might be needed :)
  }

  @Test
  public void demoNewFormattedMethodOnString() {
    // The String class has a new formatted() method which may be helpful in Text Blocks:
    assertEquals(
        "Hello, Newman\n", """
            Hello, %1s
            """.formatted("Newman"));

    // Of course, it works perfectly well on regular strings too:
    assertEquals(
        "Hello, Newman",
        "Hello, %1s".formatted("Newman"));
  }

  @Test
  public void demoSpaceEscape() {
    // Trailing spaces are ignored:
    assertEquals("foo", """
        foo   """);

    // A new escape character is equivalent to a space:
    assertEquals(" ", "\s");

    // ...but it can disable the "ignore trailing space" thing
    assertEquals("foo   ", """
        foo   \s""");
  }
}
