package example.java17;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.awt.*;
import java.util.Date;

import org.junit.jupiter.api.Test;

public class _5_RecordTest {
  /**
   * "record" means "This is a data class"
   */
  private record DatasetField(String name, Class type) {
    // You can add things here

    // Good things:
    //
    // - No need to (forget to!) maintain the toString/hashCode/equals when new fields are added
    // - Immutable

    // Future good things:
    //
    // - Pattern matching will be enhanced to be useful with Records
  }

  @Test
  public void testRecordsHaveToStringAndEquals() {
    DatasetField descriptionField = new DatasetField("description", String.class);

    // We get toString:
    assertEquals("DatasetField[name=description, type=class java.lang.String]", descriptionField.toString());

    // We get equals and hashCode:
    assertEquals(new DatasetField("color", Color.class), new DatasetField("color", Color.class));
    assertNotEquals(new DatasetField("color", Color.class), new DatasetField("otherColor", Color.class));
  }

  @Test
  public void testRecordsAllowFieldAccess() {
    DatasetField descriptionField = new DatasetField("description", String.class);

    // Getters and public fields both exist (?)
    assertEquals("description", descriptionField.name());
    assertEquals(String.class, descriptionField.type());

    assertEquals("description", descriptionField.name); // Maybe bad practice since can't be overridden/debugged?
    assertEquals(String.class, descriptionField.type);
  }

  @Test
  public void testRecordsStillAllowMutation() {
    record NameAndDate(String name, Date date) {};

    Date _12345 = new Date(12345);
    NameAndDate nameAndDate = new NameAndDate("Dave", _12345);

    _12345.setTime(98765); // Modifies the record's internal data

    assertEquals(98765, nameAndDate.date().getTime());
  }
}
