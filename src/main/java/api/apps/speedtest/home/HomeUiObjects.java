package api.apps.speedtest.home;

import api.android.Android;
import core.UiObject;
import core.UiSelector;

public class HomeUiObjects {

	private static UiObject beginTestButton, ping, download, upload, pingSpeed, downloadSpeed, uploadSpeed, testAgainButton, removeAdsButton, shareButton, logo;
	
	public UiObject beginTestButton(){
		if(beginTestButton == null) beginTestButton = new UiSelector().text("Begin Test").makeUiObject();
		return beginTestButton;
	}
	public UiObject ping(){
		if(ping == null) ping = new UiSelector().resourceId(Android.app.speedtest.packageId()+":id/ping").makeUiObject();
		return ping;
	}
	public UiObject download(){
		if(download == null) download = new UiSelector().resourceId(Android.app.speedtest.packageId()+":id/download").makeUiObject();
		return download;
	}
	
	public UiObject upload(){
		if(upload == null) upload = new UiSelector().resourceId(Android.app.speedtest.packageId()+":id/upload").makeUiObject();
		return upload;
	}
	
	public UiObject pingSpeed(){
		if(pingSpeed == null) pingSpeed = new UiSelector().resourceId(Android.app.speedtest.packageId()+":id/pingSpeed").makeUiObject();
		return pingSpeed;
	}
	
	public UiObject downloadSpeed(){
		if(downloadSpeed == null) downloadSpeed = new UiSelector().resourceId(Android.app.speedtest.packageId()+":id/downloadSpeed").makeUiObject();
		return downloadSpeed;
	}
	
	public UiObject uploadSpeed(){
		if(uploadSpeed == null) uploadSpeed = new UiSelector().resourceId(Android.app.speedtest.packageId()+":id/uploadSpeed").makeUiObject();
		return uploadSpeed;
	}
	
	public UiObject testAgainButton(){
		if(testAgainButton == null) testAgainButton = new UiSelector().text("Test Again").makeUiObject();
		return testAgainButton;
	}
	
	public UiObject removeAdsButton(){
		if(removeAdsButton == null) removeAdsButton = new UiSelector().text("Remove Ads").makeUiObject();
		return removeAdsButton;
	}
	
	public UiObject shareButton(){
		if(shareButton == null) shareButton = new UiSelector().resourceId(Android.app.speedtest.packageId()+"id/shareButton").makeUiObject();
		return shareButton;
	}
	public UiObject logo(){
		if(logo == null) logo = new UiSelector().resourceId(Android.app.speedtest.packageId()+":id/logo").makeUiObject();
		return logo;
	}
		
}
