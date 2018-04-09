package api.apps.fieldez.ticket;

import org.openqa.selenium.NoSuchElementException;

import api.apps.fieldez.login.LoginUiObjects;
import core.MyLogger;

public class Ticket {

	public ListingUIObjects uiObject = new ListingUIObjects();
	
	public void clickOnCreateTicket(){
		try{
			MyLogger.log.info("Click on create ticket link");
			uiObject.addTicket().tap();
		}catch(NoSuchElementException e){
			 throw new AssertionError("Can't get User name,element not present or blocked");
		}
	}  

}
