package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class ChangeInfo {
//////////////////////////////////////////////////////////
    private static final SelenideElement NewPassword=$x("//input[@placeholder='Password']");
    private static final SelenideElement ConfirmNewPassword=$x("//input[@placeholder='Password Confirm']");
    private static final SelenideElement Button=$x("//input[@value='Continue']");
    private static final SelenideElement Alert=$x("//div[@class='alert alert-success alert-dismissible']");

    ///////////// Return The Text of The Alert
    public String AlertText(){
        return Alert.text();
    }


    /////////////////////////////////////////////////////////////////////////////////
    public void ChangeInformationAboutPassword(String password,String confirm){
        NewPassword.shouldBe(Condition.visible).setValue(password);
        ConfirmNewPassword.shouldBe(Condition.visible).setValue(confirm);
        Button.shouldBe(Condition.visible).click();
    }


}
