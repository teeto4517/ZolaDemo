import org.testng.annotations.Test;
import pages.loginPage;

public class login extends baseClass {

    loginPage login;

    String email= "olutoyeowojaye@gmail.com"; String Pwd = "password";
    @Test
    public void loginTest () {
        login = baseClass.setDriver("http://vision-qa-challenge-n5mg45tb5x.zolaelectric.com/");
        login.loginEvent(email,Pwd);
        login.performanceScreen();
    }
}
