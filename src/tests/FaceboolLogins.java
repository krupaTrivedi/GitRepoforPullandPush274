package tests;

import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import data.FacebookLoginData;
import page.FacebookLoginsPage;

public class FaceboolLogins {
  
	FacebookLoginsPage fl = new FacebookLoginsPage();
	FacebookLoginData fd = new FacebookLoginData();
	
  @BeforeMethod
  public void beforeMethod() {
	  fl.beforeMethod();
  }
  @AfterMethod()
  public void afterMethod() {
	  fl.afterMethod();
  }
	
	
  @Test(priority = 1)
  public void loginWithWrong_1() {
	  fl.Logins(fd.email_1, fd.pass);
	  
	  String expected = fd.Err_1;
	  String actual = fl.actual_Err();
	  System.out.println(actual);
	  Assert.assertEquals(fd.Err_1, fl.actual_Err());
  }
  
  @Test(priority = 2)
  public void loginWithNoEmail_2() {
	  fl.Logins("", fd.pass);
	  
	  String expected = fd.Err_2;	  
	  String actual = fl.actual_Err();
	  Assert.assertEquals(fd.Err_2, fl.actual_Err());
  }
  
  @Test(priority = 3)
  public void loginWithNoPass_3() {
	  fl.Logins(fd.email_1, "");
	  
	  String expected = fd.Err_3;
	  String actual = fl.actual_Err();
	  Assert.assertEquals(fd.Err_3, fl.actual_Err());
  }
  
  @Test(priority = 4)
  public void loginWithInvalidEmail_4() {
	  fl.Logins(fd.InvalidEmail, fd.pass); 
	  
	  String expected = fd.Err_4;	  String actual = fl.actual_Err();
	  Assert.assertEquals(fd.Err_4, fl.actual_Err());
  }
  
  @Test(priority = 5)
  public void wrongNumber_5() {
	  fl.Logins(fd.num, fd.pass); 
	  
	  String expected =fd.Err_4;
	  String actual = fl.actual_Err();
	  Assert.assertEquals(fd.Err_4, fl.actual_Err());
  }
  
  @Test(priority = 6)
  public void emailNoAccount_6() {
	  fl.Logins(fd.noAccEmail, fd.pass); 
	  
	  String expected = fd.Err_6;
	  String actual = fl.actual_Err();
	  Assert.assertEquals(fd.Err_6,  fl.actual_Err());
  }
}
