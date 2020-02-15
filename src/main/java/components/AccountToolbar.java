package components;

import org.openqa.selenium.By;

public class AccountToolbar extends Base.Base {
    public static void clickOnTextButtonFromAccountToolbar() {
        driver.findElement(By.xpath(
                "//li[contains(@class,'gh')][contains(. , '')]")).click();
    }
}
