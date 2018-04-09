package api.apps.fieldez.login;

import core.UiObject;
import core.UiSelector;

public class LoginUiObjects {
 
	private static UiObject unTextBox, pwTextBox, loginButton,continueButton;
	
	public UiObject userNameTextBox(){
		if(unTextBox == null) unTextBox = new UiSelector().resourceId("com.fieldez.mobile:id/et_login").makeUiObject();
		return unTextBox;
	}
	
	public UiObject passwordTextBox(){
		if(pwTextBox == null) pwTextBox = new UiSelector().resourceId("com.fieldez.mobile:id/et_password").makeUiObject();
		return pwTextBox;
	}
	
	public UiObject loginButton(){
		if(loginButton == null) loginButton = new UiSelector().resourceId("com.fieldez.mobile:id/btn_login").makeUiObject();
		return loginButton;
	}
	
	public UiObject continueButton(){
		if(continueButton == null) continueButton = new UiSelector().resourceId("com.fieldez.mobile:id/continueButton").makeUiObject();
		return continueButton;
	}
}
