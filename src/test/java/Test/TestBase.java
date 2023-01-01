package Test;

import com.github.javafaker.Faker;
import org.aeonbits.owner.ConfigFactory;
import org.testng.annotations.BeforeSuite;
import pages.FrameWorkConfig;

import java.util.Locale;

import static com.codeborne.selenide.Selenide.open;



public class TestBase {

    FrameWorkConfig config;

    Faker faker = new Faker(new Locale("es"));
    String email=faker.internet().safeEmailAddress();
    @BeforeSuite
    public void setup(){
         config= ConfigFactory.create(FrameWorkConfig.class);

        open(config.url());
    }



//    @AfterSuite
//    public void TearDown(){
//        closeWebDriver();
//    }
}
