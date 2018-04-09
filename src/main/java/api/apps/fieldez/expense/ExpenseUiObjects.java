package api.apps.fieldez.expense;

import core.UiObject;
import core.UiSelector;

public class ExpenseUiObjects {

	private static UiObject viewPolicy,searchExp,backOnSearch,searchString,addExp,userFilter;
	
	public UiObject viewPolicy(){
		if(viewPolicy == null) viewPolicy = new UiSelector().text("View Expense Policy").makeUiObject();
		return viewPolicy;
	}
	
	public UiObject searchExp(){
		if(searchExp == null) searchExp = new UiSelector().resourceId("com.fieldez.mobile:id/menu_expense_search").makeUiObject();
		return searchExp;
	}
	
	public UiObject backOnSearch(){
		if(backOnSearch == null) backOnSearch = new UiSelector().description("Collapse").makeUiObject();
		return backOnSearch;
	}
	public UiObject searchString(){
		if(searchString == null) searchString = new UiSelector().resourceId("com.fieldez.mobile:id/search_src_text").makeUiObject();
		return searchString;
	}
	
	public UiObject addExp(){
		if(addExp == null) addExp = new UiSelector().resourceId("com.fieldez.mobile:id/menu_expense_add").makeUiObject();
		return addExp;
	}
	public UiObject userFilter(){
		if(userFilter == null) userFilter = new UiSelector().resourceId("com.fieldez.mobile:id/menu_expense_assignee").makeUiObject();
		return userFilter;
	}
	
	
}
