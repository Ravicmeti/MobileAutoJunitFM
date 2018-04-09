package api.apps.fieldez.expense;

import core.UiObject;
import core.UiSelector;

public class PolicyUiObjects {

	private static UiObject back;
	public UiObject viewExpPolicyBack(){
		if(back == null) back = new UiSelector().description("Navigate up").makeUiObject();
		return back;
	}
	
}
