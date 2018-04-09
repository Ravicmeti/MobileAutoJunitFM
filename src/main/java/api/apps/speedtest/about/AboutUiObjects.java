package api.apps.speedtest.about;

import core.UiObject;
import core.UiSelector;

public class AboutUiObjects {

private static UiObject privatePolicy, termsOfUse, logo;
	
	public UiObject privatePolicy(){
		if(privatePolicy == null) privatePolicy = new UiSelector().description("Privecy Policy").makeUiObject();
		return privatePolicy;
	}
	
	public UiObject termsOfUse(){
		if(termsOfUse == null) termsOfUse = new UiSelector().description("Terms of Use").makeUiObject();
		return termsOfUse;
	}
	
	public UiObject logo(){
		if(logo == null) logo = new UiSelector().description("Speedtest.net").makeUiObject();
		return logo;
	}
	
}
