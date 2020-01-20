import static org.junit.jupiter.api.Assertions.assertLinesMatch;

import java.util.List;
import org.junit.jupiter.api.Test;

class CallTests {
  @Test
  void builder() {
    var call =
        Make.Tool.Call.newCall("call", "init-1", "init-2")
            .add("singleton")
            .add("key", "value")
            .add(true, "conditional")
            .add(true, "conditional-key", "conditional-value")
            .build();
    assertLinesMatch(
        List.of(
            "init-1",
            "init-2",
            "singleton",
            "key",
            "value",
            "conditional",
            "conditional-key",
            "conditional-value"),
        call.args());
  }
}
