import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;
import java.nio.file.Path;

class MakeTests {
  @Test
  void defaults() {
    var make = Make.of(Path.of(".").normalize().toAbsolutePath());
    assertFalse(make.debug);
    assertFalse(make.dryRun);
    assertEquals(Make.USER_PATH, make.home);
    assertEquals("make-java", make.project);
    assertEquals("1.0.0-SNAPSHOT", make.version);
  }
}
