package textAnalyser;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.sun.codemodel.JBlock;
import com.sun.codemodel.JClassAlreadyExistsException;
import com.sun.codemodel.JCodeModel;
import com.sun.codemodel.JDefinedClass;
import com.sun.codemodel.JExpr;
import com.sun.codemodel.JExpression;
import com.sun.codemodel.JFieldVar;
import com.sun.codemodel.JMethod;
import com.sun.codemodel.JMod;
import com.sun.codemodel.JVar;
import com.sun.codemodel.writer.SingleStreamCodeWriter;

public class Test {
		
	public static void main(String s[]) throws Exception
	{
		One.extractor(One.type);
		
		System.out.println(One.objc);
		int i =5;
		try{
		JCodeModel codeModel = new JCodeModel();

		JDefinedClass foo = codeModel._class( "Login_page" );
		JFieldVar field1 = foo.field(JMod.PUBLIC,WebDriver.class,"driver");
		
		
		JFieldVar field2 = foo.field(JMod.PRIVATE | JMod.STATIC,WebElement.class,"element" );
  for(int j =0 ;j<One.objc.size();j++)
  {
		 JMethod jmCreate = foo.method(JMod.PUBLIC | JMod.STATIC, WebDriver.class, "txtbx_UserName");
		 jmCreate.param(field2.type(),"element");
		 JBlock jBlock = jmCreate.body();
		 jBlock.directStatement("try{element=driver.findElement(By.cssSelector("+One.objc.get(j)+"));	}catch(Exception e){e.printStackTrace();}");
		 
		 jmCreate.body()._return(field2);
  }
		 codeModel.build(new File("D:/"));
	}catch(Exception e)
	{
		
	}
	
	}
}
