package api.apps.fieldez.home;

import org.openqa.selenium.NoSuchElementException;

import core.MyLogger;

public class Home {

	public HomeUiObjects uiObject = new HomeUiObjects();
	
	public void clickExpenseLink(){
		try{
			MyLogger.log.info("Clicking Expense link");
			uiObject.expenseLink().tap();
		}catch(NoSuchElementException e){
			 throw new AssertionError("Can't get User name,element not present or blocked");
		}
	}
	
	public void clickJobLink(){
		try{
			MyLogger.log.info("Clicking Expense link");
			uiObject.job().tap();
		}catch(NoSuchElementException e){
			 throw new AssertionError("Can't get User name,element not present or blocked");
		}
	}
		
}
