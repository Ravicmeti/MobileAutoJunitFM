package api.apps.fieldez.home;

import core.UiObject;
import core.UiSelector;

public class HomeUiObjects {

	private static UiObject job,careVisit,call,dashboard,customer,leave,asset,calendar,message,attendance,tracker,expense,pinLocation;
	
	public UiObject expenseLink(){
		if(expense == null) expense = new UiSelector().text("Expense").makeUiObject();
		return expense;
	}
	
	public UiObject job(){
		if(job == null) job = new UiSelector().text("job").makeUiObject();
		return job;
	}
}
