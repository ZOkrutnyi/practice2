import com.delphi.app.Part1;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class Part1Test {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }
    @Test
    public void validParams()
    {
        Part1.main(new String[]{"Zakhar", "2"});
        assertEquals("107"+System.lineSeparator(), outContent.toString());
    }
    @Test
    public void zeroParams()
    {
        Part1.main(new String[]{});
        assertEquals("Invalid arguments"+System.lineSeparator(), outContent.toString());
    }
    @Test
    public void invalidParams()
    {
        Part1.main(new String[]{"Name", "ha"});
        assertEquals("Invalid number"+System.lineSeparator(), outContent.toString());
    }
    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }
}
