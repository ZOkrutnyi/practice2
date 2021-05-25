import com.delphi.app.Part2;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class Part2Test {
    Part2 part2 = new Part2();

    @Test
    public void compareSameWords() {
        assertTrue(part2.compareStr("hello", "HelLo"));
    }

    @Test
    public void compareNull() {
        Assert.assertFalse(part2.compareStr("hello", null));
    }

    @Test
    public void compareDifferentWords() {
        Assert.assertFalse(part2.compareStr("hello", "null"));
    }
}
