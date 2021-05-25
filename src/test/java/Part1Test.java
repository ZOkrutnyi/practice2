import com.delphi.app.Part1;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Part1Test {
    Part1 part1 = new Part1();

    @Test
    public void inputValid() {
        assertEquals(108, part1.getChar("Hello", 3));
    }

    @Test
    public void inputInvalid() {
        assertEquals(-1, part1.getChar("hello", 10));
    }

    @Test
    public void inputNull() {
        assertEquals(-1, part1.getChar(null, 10));
    }
}
