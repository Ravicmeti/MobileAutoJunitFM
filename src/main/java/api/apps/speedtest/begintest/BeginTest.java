package api.apps.speedtest.begintest;

import org.openqa.selenium.NoSuchElementException;

import api.android.Android;
import api.apps.speedtest.home.Home;
import api.interfaces.Activity;
import core.MyLogger;

public class BeginTest implements Activity {

public BeginTestUiObjects uiObject = new BeginTestUiObjects();
	
	public Home tapBeginTest(){
		try{
			MyLogger.log.info("Tapping BeginTest button");
			uiObject.beginTestButton().tap();
			Android.app.speedtest.home.uiObject.testAgainButton().waitToAppear(120);
			return Android.app.speedtest.home;
		}catch(NoSuchElementException e){
			 throw new AssertionError("Can't tap on speedtest button,element not present or blocked");
		}catch(AssertionError e){
			throw new AssertionError("Speed test failed to complete within 120 sec");
		}
	}

	public BeginTest waitToLoad() {
		try{
			MyLogger.log.info("Waiting for begin Test activity");
			uiObject.beginTestButton().waitToAppear(10);
			return Android.app.speedtest.beginTest;
		}catch(AssertionError e){
			throw new AssertionError("beging test activity is failed to open/load");
		}
	}
}
