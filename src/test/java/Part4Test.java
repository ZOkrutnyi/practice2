import com.delphi.app.Part4;
import org.junit.Assert;
import org.junit.Test;

public class Part4Test {
    Part4 part4 = new Part4();

    @Test
    public void fullConnString() {
        Assert.assertEquals("IP: localhost\n" +
                "Name: MyTest\n" +
                "Port: 8674\n", part4.connData("localhost\\MyTest,8674"));
    }
    @Test
    public void onlyIPConnString() {
        Assert.assertEquals("IP: localhost\n" +
                "Name: defaultServerName\n" +
                "Port: 8080\n", part4.connData("localhost\\"));
    }
    @Test
    public void IPNameConnString() {
        Assert.assertEquals("IP: localhost\n" +
                "Name: interpol\n" +
                "Port: 8080\n", part4.connData("localhost\\interpol"));
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
