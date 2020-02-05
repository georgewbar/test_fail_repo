import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestFailTest {

    @Test
    void testGetTrue() {
        TestFail cts = new TestFail();
        assertFalse(cts.getTrue());
    }

}