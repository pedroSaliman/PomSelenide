package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class LoginPage {

    private static final SelenideElement Email=$x("//input[@placeholder='E-Mail Address']");
    private static final SelenideElement Password=$x("//input[@placeholder='Password']");
    private static final SelenideElement Button=$x("//input[@value='Login']");


    //////////////////////////////////////////////

    public MyAccountPage LoginProcess(String email,String password){
        Email.shouldBe(Condition.visible).setValue(email);
        Password.shouldBe(Condition.visible).setValue(password);
        Button.shouldBe(Condition.visible).click();
        return new MyAccountPage();


    }


}
