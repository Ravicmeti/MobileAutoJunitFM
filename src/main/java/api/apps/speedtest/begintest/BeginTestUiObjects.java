package api.apps.speedtest.begintest;

import core.UiObject;
import core.UiSelector;

public class BeginTestUiObjects {

private static UiObject beginTestButton;
	
	public UiObject beginTestButton(){
		if(beginTestButton == null) beginTestButton = new UiSelector().text("Begin Test").makeUiObject();
		return beginTestButton;
	}
}
