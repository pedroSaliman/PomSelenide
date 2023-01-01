package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class EditAccount {
    private static final SelenideElement fName=$x("//input[@id='input-firstname']");
    private static final SelenideElement Button=$x("//input[@value='Continue']");
    private static final SelenideElement Success=$x("//div[@class='alert alert-success alert-dismissible']");

    public void editInfo(String FirstName){
        fName.shouldBe(Condition.visible).setValue(FirstName);
        Button.shouldBe(Condition.visible).click();
        Success.shouldBe(Condition.visible);
    }
    public String MessageOfAlertToUpdateMyAccount(){
        return Success.text();
    }

}
