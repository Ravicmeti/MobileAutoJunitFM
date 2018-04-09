package api.apps.speedtest.results;

import api.android.Android;
import core.UiObject;
import core.UiSelector;

public class ResultsUiObjects {
	
	private static UiObject  logo, sortByType, sortByTime,sortByDownload,sortByUpload,sortByPing,toolsButton,resultsLabel;
	
	public UiObject logo(){
		if(logo == null) logo = new UiSelector().resourceId(Android.app.speedtest.packageId()+":id/logo").makeUiObject();
		return logo;
	}
	
	public UiObject sortByType(){
		if(sortByType == null) sortByType = new UiSelector().resourceId(Android.app.speedtest.packageId()+":id/typeLayout").makeUiObject();
		return sortByType;
	}
	
	public UiObject sortByTime(){
		if(sortByTime == null) sortByTime = new UiSelector().resourceId(Android.app.speedtest.packageId()+":id/timeLayout").makeUiObject();
		return sortByTime;
	}
	public UiObject sortByDownload(){
		if(sortByDownload == null) sortByDownload = new UiSelector().resourceId(Android.app.speedtest.packageId()+":id/downloadLayout").makeUiObject();
		return sortByDownload;
	}
	public UiObject sortByUpload(){
		if(sortByUpload == null) sortByUpload = new UiSelector().resourceId(Android.app.speedtest.packageId()+":id/uploadLayout").makeUiObject();
		return sortByUpload;
	}
	public UiObject sortByPing(){
		if(sortByPing == null) sortByPing = new UiSelector().resourceId(Android.app.speedtest.packageId()+":id/pingLayout").makeUiObject();
		return sortByPing;
	}
	public UiObject toolsButton(){
		if(toolsButton == null) toolsButton = new UiSelector().resourceId(Android.app.speedtest.packageId()+":id/toolsButton").makeUiObject();
		return toolsButton;
	}
	public UiObject resultsLabel(){
		if(resultsLabel == null) resultsLabel = new UiSelector().resourceId(Android.app.speedtest.packageId()+":id/resultsCountText").makeUiObject();
		return resultsLabel;
	}

}
