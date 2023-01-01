package pages;

import org.aeonbits.owner.Config;
@Config.Sources(value = "file:E:/seleniumprojects/gitendtoend/Frame/src/test/resources/FrameWorkConfig.properties")
public interface FrameWorkConfig extends Config {
    String url();
    String fname();
    String lname();
    String email();
    String telephone();
    String password();
    String confirm();
    String product();
    String changepassword();
    String anotherproduct();
}
