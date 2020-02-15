import Base.Base;
import components.AccountToolbar;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {
    @BeforeTest
    public static void openSystem() {
        Base.init();
    }

    @Test
    public static void test1() {
        AccountToolbar.clickOnTextButtonFromAccountToolbar("");
    }
}
