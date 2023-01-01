package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class RegisterPage {

    private static final SelenideElement fName=$x("//input[@id='input-firstname']");
    private static final SelenideElement lName=$x("//input[@id='input-lastname']");
    private static final SelenideElement Email=$x("//input[@id='input-email']");
    private static final SelenideElement Telephone=$x("//input[@id='input-telephone']");
    private static final SelenideElement Password=$x("//input[@id='input-password']");
    private static final SelenideElement ConfirmPassword=$x("//input[@id='input-confirm']");
    private static final SelenideElement Check=$x("//label[normalize-space()='Yes']");
    private static final SelenideElement Privacy=$x("//input[@name='agree']");
    private static final SelenideElement Button=$x("//input[@value='Continue']");


    public static  MyAccountPage Register(String FirstName,String LastName,String email,String telephone,String password,String confirmPassword){
        fName.shouldBe(Condition.visible).setValue(FirstName);
        lName.shouldBe(Condition.visible).setValue(LastName);
        Email.shouldBe(Condition.visible).setValue(email);
        Telephone.shouldBe(Condition.visible).setValue(telephone);
        Password.shouldBe(Condition.visible).setValue(password);
        ConfirmPassword.shouldBe(Condition.visible).setValue(confirmPassword);
        Check.shouldBe(Condition.visible).click();
        Privacy.shouldBe(Condition.visible).click();
        Button.shouldBe(Condition.visible).click();
        return new MyAccountPage();
    }

}
