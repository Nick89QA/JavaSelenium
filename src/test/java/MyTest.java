
import org.testng.annotations.Test;
import utils.CustomWait;

public class MyTest extends BaseTest {
    public String expectURL = "https://demoqa.com/";


    @Test
    public void myTestJava() {
        CustomWait wait = new CustomWait(driver);
        driver.get("https://demoqa.com/");

        System.out.println("URL matches expectValue " + expectURL.equals(driver.getCurrentUrl()));

    }
}
