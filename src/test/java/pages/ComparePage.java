package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class ComparePage {
    private static final SelenideElement H1 =$x("//h1[normalize-space()='Product Comparison']");

    public String MessageOfCompare(){
       return H1.shouldBe(Condition.visible).text();
    }
}
