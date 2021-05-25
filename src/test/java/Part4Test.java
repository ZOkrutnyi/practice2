import com.delphi.app.Part4;
import org.junit.Assert;
import org.junit.Test;

public class Part4Test {
    Part4 part4 = new Part4();

    @Test
    public void validConnString() {
        Assert.assertEquals("Port: localhost\n" +
                "Instance name: MyTest\n" +
                "IP: 8674", part4.connData("localhost\\MyTest,8674"));
    }

    @Test
    public void inputNull() {
        Assert.assertEquals("Invalid connection type", part4.connData(null));
    }

    @Test
    public void inputInvalidData() {
        Assert.assertEquals("Invalid connection type", part4.connData("I think this is ip"));
    }
}
