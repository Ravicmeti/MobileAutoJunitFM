package api.apps.speedtest.home;

import org.openqa.selenium.NoSuchElementException;

import api.android.Android;
import api.interfaces.Activity;
import core.MyLogger;



public class Home implements Activity{

	public HomeUiObjects uiObject = new HomeUiObjects();
	
	public String getPingSpeed(){
		try{
			MyLogger.log.info("Getting Ping Speed");
			return uiObject.pingSpeed().getText();
		}catch(NoSuchElementException e){
			 throw new AssertionError("Can't get ping speed,element not present or blocked");
		}
	}
	
	public String getDownloadSpeed(){
		try{
			MyLogger.log.info("Getting Download Speed");
			return uiObject.downloadSpeed().getText();
		}catch(NoSuchElementException e){
			 throw new AssertionError("Can't get download speed,element not present or blocked");
		}
	}
	
	public String getUploadSpeed(){
		try{
			MyLogger.log.info("Getting Upload Speed");
			return uiObject.uploadSpeed().getText();
		}catch(NoSuchElementException e){
			 throw new AssertionError("Can't get upload speed,element not present or blocked");
		}
	}
	
	public Home tapTestAgain(){
		try{
			MyLogger.log.info("Tapping testAgain button");
			uiObject.testAgainButton().tap().waitToDisappear(5).waitToAppear(120);
			return Android.app.speedtest.home;
			//return this;
		}catch(NoSuchElementException e){
			 throw new AssertionError("Can't get upload speed,element not present or blocked");
		}
	}
	
	public Home tapBeginTest(){
		try{
			MyLogger.log.info("Tapping BeginTest button");
			uiObject.beginTestButton().waitToAppear(5).tap().waitToDisappear(5).waitToAppear(240);
			return Android.app.speedtest.home;
			//return this;
		}catch(NoSuchElementException e){
			 throw new AssertionError("Can't get upload speed,element not present or blocked");
		}
	}

	public Home waitToLoad() {
		try{
			MyLogger.log.info("Waiting for Home activity");
			uiObject.testAgainButton().waitToAppear(10);
			return Android.app.speedtest.home;
			//return this;
		}catch(AssertionError e){
			 throw new AssertionError("Load activity fialed to load or open");
		}
	}
	
	
	
	
	
}
