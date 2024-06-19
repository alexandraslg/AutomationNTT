import actions.SimpleActions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utile.BaseTest;

public class SimpleTest extends BaseTest {

    @Test
    public void firstTest(){
        initTest("Sample test");

        driver.get("https://apptest.go.ro:9999/login");

        String expectedText = "Login";

        SimpleActions simpleActions = new SimpleActions(driver);
        String loginText = simpleActions.getLoginText();

        Assert.assertEquals(loginText.toLowerCase(), expectedText.toLowerCase());

        System.out.println(loginText);
        System.out.println(expectedText);

    }
}
