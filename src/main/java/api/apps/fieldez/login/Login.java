package api.apps.fieldez.login;

import org.openqa.selenium.NoSuchElementException;

import core.MyLogger;

public class Login {

	public LoginUiObjects uiObject = new LoginUiObjects();
	
	public void enterUserName(){
		try{
			MyLogger.log.info("Entering User name");
			uiObject.userNameTextBox().typeText("sr7815");
		}catch(NoSuchElementException e){
			 throw new AssertionError("Can't get User name,element not present or blocked");
		}
	}
	
	public void enterPassword(){
		try{
			MyLogger.log.info("Entering Password");
			uiObject.passwordTextBox().typeText("test123");
		}catch(NoSuchElementException e){
			 throw new AssertionError("Can't get Password,element not present or blocked");
		}
	}
	
	public void clickLogin() throws InterruptedException{
		try{
			MyLogger.log.info("Clickking login button");
			 uiObject.loginButton().tap();
			 Thread.sleep(20000);
		}catch(NoSuchElementException e){
			 throw new AssertionError("Can't get upload speed,element not present or blocked");
		}
	}
	
	public static Login getObject() {
		return new Login();
	}
	
	/*public void clickContinue(){
		try{
			MyLogger.log.info("Clickking continue button");
			 uiObject.continueButton().waitToAppear(60).tap();
		}catch(NoSuchElementException e){
			 throw new AssertionError("Can't get upload speed,element not present or blocked");
		}
	}*/
	
}
