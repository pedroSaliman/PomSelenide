package Test;


import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class TestCases extends TestBase{


    @Test
    public void registerInfo(){
        new Home().registerClick();
          new RegisterPage().Register(config.fname(), config.lname(), email, config.telephone(), config.password(), config.confirm());
        Assert.assertEquals("Your Account Has Been Created!",new MyAccountPage().message());

    }


    @Test(dependsOnMethods = {"registerInfo"})
    public void LoginCase(){
        new Home()
                .logout().LoginProcess(email, config.password());
        Assert.assertEquals("My Account",new MyAccountPage().MessageOfHeader());
    }

@Test(dependsOnMethods = {"LoginCase"})
    public void EditAccountCase(){
        new MyAccountPage().edit().editInfo(config.fname());
        Assert.assertEquals("Success: Your account has been successfully updated.",new EditAccount().MessageOfAlertToUpdateMyAccount());

}
@Test(dependsOnMethods = {"EditAccountCase"})

    public void ChangePass(){
        new MyAccountPage().change().ChangeInformationAboutPassword(config.changepassword(), config.changepassword());
        Assert.assertEquals("Success: Your password has been successfully updated.",new ChangeInfo().AlertText());
}














@Test(dependsOnMethods = {"ChangePass"})
    public void CompareCase(){
    new MyAccountPage()
            .search(config.product()).CompareClick();
    new MyAccountPage()
            .search(config.anotherproduct()).CompareClick();
Assert.assertEquals("Product Comparison",new ComparePage().MessageOfCompare());

}






}
