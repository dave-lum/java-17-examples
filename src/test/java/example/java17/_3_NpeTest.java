package example.java17;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

public class _3_NpeTest {
  @Test
  public void testNullPointer() {
    Map<String,Map> map1 = new HashMap<>();
    Map<String,String> map2 = new HashMap<>();
    map2.put("foo", "bar");
    map1.put("map2", map2);
    String s2 = map1.get("map2").get("bar").toString();
  }
}
