import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pageObjectsInput {

    public static WebDriver driver;
    private static WebElement element;

    public static WebElement email0() {
        try{element=driver.findElement(By.id("email"));	}catch(Exception e){e.printStackTrace();}
        return element;
    }

    public static WebElement password1() {
        try{element=driver.findElement(By.id("pass"));	}catch(Exception e){e.printStackTrace();}
        return element;
    }

    public static WebElement text2() {
        try{element=driver.findElement(By.id("u_0_b"));	}catch(Exception e){e.printStackTrace();}
        return element;
    }

}
