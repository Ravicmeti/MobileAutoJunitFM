package api.apps.speedtest.results;

import core.MyLogger;
import api.android.Android;
import api.interfaces.Activity;

public class Results implements Activity {
	
	public ResultsUiObjects uiObject = new ResultsUiObjects();
	
	public Results sortBy(){
		
		return Android.app.speedtest.results;
	}

	public Results waitToLoad() {
		try{
			MyLogger.log.info("Waiting for Result activity");
			uiObject.resultsLabel().waitToAppear(10);
			return Android.app.speedtest.results;
		}catch(AssertionError e){
			 throw new AssertionError("Result activity fialed to load or open");
		}
	}

}
