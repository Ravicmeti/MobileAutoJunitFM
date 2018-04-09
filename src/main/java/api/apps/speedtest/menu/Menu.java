package api.apps.speedtest.menu;

import org.openqa.selenium.NoSuchElementException;

import api.android.Android;
import api.apps.speedtest.home.Home;
import api.apps.speedtest.results.Results;
import core.MyLogger;

public class Menu {

	public MenuUiObjects uiObject = new MenuUiObjects();
	
	public Home tapSpeedtest(){
		try{
			MyLogger.log.info("Tapping on Speedtest menu button");
			uiObject.speedtest().tap(); 
			return Android.app.speedtest.home.waitToLoad();
		}catch(NoSuchElementException e){
			 throw new AssertionError("Can't tap on speedtest button,element not present or blocked");
		}
	}
	
	public Results tapResults(){
		try{
			MyLogger.log.info("Tapping on Results menu button");
			uiObject.results().tap(); 
			return Android.app.speedtest.results.waitToLoad();
		}catch(NoSuchElementException e){
			 throw new AssertionError("Can't tap on Results button,element not present or blocked");
		}
	}
	
	public void tapSettings(){
		try{
			MyLogger.log.info("Tapping on Settings menu button");
			uiObject.settings().tap(); 
		}catch(NoSuchElementException e){
			 throw new AssertionError("Can't tap on Settings button,element not present or blocked");
		}
	}
	
	public void tapAbout(){
		try{
			MyLogger.log.info("Tapping on About menu button");
			uiObject.about().tap(); 
		}catch(NoSuchElementException e){
			 throw new AssertionError("Can't tap on About button,element not present or blocked");
		}
	}
}
