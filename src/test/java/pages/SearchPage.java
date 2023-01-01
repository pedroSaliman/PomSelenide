package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class SearchPage {

    private static final SelenideElement Message=$x("//h2[normalize-space()='Products meeting the search criteria']");
    private static final SelenideElement ImageClick=$x("//img[@title='iPhone']");
    private static final SelenideElement AddToCompareList=$x("//button[@data-original-title='Compare this Product']");
    private static final SelenideElement AlertCompare=$x("//a[normalize-space()='product comparison']");

    //////////Compare
    public ComparePage CompareClick(){
        AddToCompareList.shouldBe(Condition.visible).click();
        AlertCompare.shouldBe(Condition.visible).click();
        return new ComparePage();
    }
    /////////////////////////////////////

//  public static final SelenideElement Alert=$(".alert.alert-success.alert-dismissible");
    public String text(){
        return Message.text();
    }
    public void image(){
        ImageClick.shouldBe(Condition.visible).click();
    }




}
