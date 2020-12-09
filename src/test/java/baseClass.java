import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pages.loginPage;

import java.util.concurrent.TimeUnit;

public class baseClass {

        protected static WebDriver driver;


        public static loginPage setDriver(String url) {

            driver.get(url);

            return new loginPage(driver);

        }

        @BeforeTest
        public void baseClass() {

            System.setProperty ( "webdriver.chrome.driver" , "src\\main\\resources\\chromedriver.exe" );

            driver = new ChromeDriver();

            driver.manage().deleteAllCookies();

            driver.manage().window().maximize();

            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        }

        @AfterTest
        public void closeDriver () {

            driver.close();
        }
    }
