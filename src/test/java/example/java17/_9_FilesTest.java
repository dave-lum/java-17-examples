package example.java17;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.jupiter.api.Test;

public class _9_FilesTest {
  @Test
  public void testReadWriteText() throws Exception {
    Path tempFile = Paths.get("/tmp/foo.txt");

    Files.writeString(tempFile, "Hello from Java!");

    String roundTrip = Files.readString(tempFile);

    assertEquals("Hello from Java!", roundTrip);
  }
}
