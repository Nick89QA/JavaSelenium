import org.testng.annotations.Test;

public class MyTest extends BaseTest {
    public String expectURL = "https://google.com";

    @Test
    public void myTestJava() {
        driver.get("https://google.com");
        System.out.println("URL matches expectValue " + expectURL.equals(driver.getCurrentUrl()));

    }
}
