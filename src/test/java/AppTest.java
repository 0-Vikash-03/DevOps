import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    void testAdd1() {
        assertEquals(5, App.add(2, 3));
    }

    @Test
    void testAdd2() {
        assertEquals(10, App.add(5, 5));
    }

    @Test
    void testAdd3() {
        assertEquals(0, App.add(-2, 2));
    }

    @Test
    void testSubtract1() {
        assertEquals(2, App.subtract(5, 3));
    }

    @Test
    void testSubtract2() {
        assertEquals(0, App.subtract(5, 5));
    }
}