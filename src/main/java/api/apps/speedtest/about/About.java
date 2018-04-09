package api.apps.speedtest.about;

import core.MyLogger;
import api.android.Android;
import api.interfaces.Activity;


public class About implements Activity {

	public AboutUiObjects uiObject = new AboutUiObjects();

	public About waitToLoad() {
		try{
			MyLogger.log.info("Waiting for About activity");
			uiObject.termsOfUse().waitToAppear(10);
			return Android.app.speedtest.about;
		}catch(AssertionError e){
			 throw new AssertionError("About activity failed to load/open");
		}
	}
}
