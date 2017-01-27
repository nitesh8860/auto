package textAnalyser;
i
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.sun.codemodel.*;

public class codeGen extends One {

	//static One o = new One();
	// static int i = 0;

	public static void coder() throws Exception {

		{ 
			
			JCodeModel codeModel = new JCodeModel();
			try {

				JDefinedClass foo = codeModel._class("pageObjectsInput");

				JFieldVar field1 = foo.field(JMod.PUBLIC | JMod.STATIC, WebDriver.class, "driver");

				JFieldVar field2 = foo.field(JMod.PRIVATE | JMod.STATIC, WebElement.class, "element");

				System.out.println(objc.size());
				for (int j = 0; j < One.objtag.size();j++) {
					
					JMethod jmCreate = foo.method(JMod.PUBLIC | JMod.STATIC, WebElement.class, One.objTypeName.get(j) +j);
					
					JBlock jBlock = jmCreate.body();
					jBlock.directStatement("try{element=driver.findElement(By." + One.objtag.get(j) + "("
							+ One.objc.get(j) + "));	}catch(Exception e){e.printStackTrace();}");
					jmCreate.body()._return(field2);

				
				}
				codeModel.build(new File("C://Users/krunal_trivedi/workspace/B/src/textAnalyser/"));

			} catch (Exception e) {

			}

		}

	}

}
