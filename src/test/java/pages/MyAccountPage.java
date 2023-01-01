package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class MyAccountPage {
private static final SelenideElement H2=$x("//h2[normalize-space()='My Account']");
private static final SelenideElement H1=$x("//h1[normalize-space()='Your Account Has Been Created!']");
private static final SelenideElement EditInfo=$x("//a[normalize-space()='Edit Account']");
private static final SelenideElement Search=$x("//input[@placeholder='Search']");
private static final SelenideElement ChangePassword=$x("//a[normalize-space()='Password']");

public String MessageOfHeader(){return H2.text();}
public ChangeInfo change(){
    ChangePassword.shouldBe(Condition.visible).click();
    return new ChangeInfo();
}
public String  message(){
    return H1.text();
    }
    // Edit Information
    public EditAccount edit(){
    EditInfo.shouldBe(Condition.visible).click();
    return new EditAccount();
    }

    // Search For Product
    public SearchPage search(String product){
    Search.shouldBe(Condition.visible).setValue(product).pressEnter();
    return new SearchPage();
    }


}
