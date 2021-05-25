import com.delphi.app.Part3;
import org.junit.Assert;
import org.junit.Test;

public class Part3Test {
    Part3 part3 = new Part3();
    @Test
    public void inputValidData()
    {
        Assert.assertEquals("HELLO",part3.toUpperCase("hello"));
    }
    @Test
    public void inputFullString()
    {
        Assert.assertEquals("HELLO FROM 1ST PLACE",part3.toUpperCase("hello from 1st place"));
    }
    @Test
    public void inputOnlyLetter()
    {
        Assert.assertEquals("H",part3.toUpperCase("h"));
    }
    @Test
    public void inputCyrillic()
    {
        Assert.assertEquals("ЗАХАР",part3.toUpperCase("захар"));
    }
    @Test
    public void inputNull()
    {
        Assert.assertNull(part3.toUpperCase(null));
    }
}
