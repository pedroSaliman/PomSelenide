package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class Home {

 private static final    SelenideElement MyAccount =$x("//span[normalize-space()='My Account']");
        private static final    SelenideElement Register =$x("//a[normalize-space()='Register']");
        private static final  SelenideElement Logout=$x("//a[normalize-space()='Logout']");
private static final SelenideElement LoginButton=$x("//a[normalize-space()='Login']");


        public RegisterPage registerClick(){
                 MyAccount.shouldBe(Condition.visible);
                 MyAccount.click();
                 Register.shouldBe(Condition.visible);
                 Register.click();
                 return new RegisterPage();
         }
         public LoginPage logout(){
             MyAccount.shouldBe(Condition.visible);
             MyAccount.click();
            Logout.shouldBe(Condition.visible).click();
             MyAccount.shouldBe(Condition.visible);
             MyAccount.click();
            LoginButton.shouldBe(Condition.visible).click();
            return new LoginPage();
         }


}
