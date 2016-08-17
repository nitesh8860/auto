import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pageObjects {

    public static WebDriver driver;
    private static WebElement element;

    public static WebElement radio0() {
        try{element=driver.findElement(By.id("email"));	}catch(Exception e){e.printStackTrace();}
        return element;
    }

    public static WebElement radio1() {
        try{element=driver.findElement(By.id("pass"));	}catch(Exception e){e.printStackTrace();}
        return element;
    }

    public static WebElement radio2() {
        try{element=driver.findElement(By.id("u_0_b"));	}catch(Exception e){e.printStackTrace();}
        return element;
    }

    public static WebElement radio3() {
        try{element=driver.findElement(By.id("u_0_1"));	}catch(Exception e){e.printStackTrace();}
        return element;
    }

    public static WebElement radio4() {
        try{element=driver.findElement(By.id("u_0_3"));	}catch(Exception e){e.printStackTrace();}
        return element;
    }

    public static WebElement radio5() {
        try{element=driver.findElement(By.id("u_0_6"));	}catch(Exception e){e.printStackTrace();}
        return element;
    }

    public static WebElement radio6() {
        try{element=driver.findElement(By.id("u_0_9"));	}catch(Exception e){e.printStackTrace();}
        return element;
    }

    public static WebElement radio7() {
        try{element=driver.findElement(By.id("u_0_b"));	}catch(Exception e){e.printStackTrace();}
        return element;
    }

    public static WebElement radio8() {
        try{element=driver.findElement(By.id("captcha_response"));	}catch(Exception e){e.printStackTrace();}
        return element;
    }

    public static WebElement radio9() {
        try{element=driver.findElement(By.id("u_0_w"));	}catch(Exception e){e.printStackTrace();}
        return element;
    }

    public static WebElement radio10() {
        try{element=driver.findElement(By.id("u_0_e"));	}catch(Exception e){e.printStackTrace();}
        return element;
    }

    public static WebElement radio11() {
        try{element=driver.findElement(By.id("u_0_f"));	}catch(Exception e){e.printStackTrace();}
        return element;
    }

}
