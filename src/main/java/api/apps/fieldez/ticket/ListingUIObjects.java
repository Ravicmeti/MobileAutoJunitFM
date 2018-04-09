package api.apps.fieldez.ticket;

import core.UiObject;
import core.UiSelector;

public class ListingUIObjects {

	private static UiObject search,addTicket,userFilter;
	
	public UiObject search(){
		if(search == null) search = new UiSelector().resourceId("com.fieldez.mobile:id/menu_call_search").makeUiObject();
		return search;
	}
	public UiObject addTicket(){
		if(addTicket == null) addTicket = new UiSelector().resourceId("com.fieldez.mobile:id/menu_call_add").makeUiObject();
		return addTicket;
	}
	public UiObject userFilter(){
		if(userFilter == null) userFilter = new UiSelector().resourceId("com.fieldez.mobile:id/menu_assignee_filter").makeUiObject();
		return userFilter;
	}
}
