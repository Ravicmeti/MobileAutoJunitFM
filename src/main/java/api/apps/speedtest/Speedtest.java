package api.apps.speedtest;

import api.android.Android;
import api.apps.speedtest.about.About;
import api.apps.speedtest.begintest.BeginTest;
import api.apps.speedtest.home.Home;
import api.apps.speedtest.menu.Menu;
import api.apps.speedtest.results.Results;
import api.interfaces.Application;

public class Speedtest implements Application {

	public Menu menu = new Menu();
	public Home home = new Home();
	public About about = new About();
	public BeginTest beginTest = new BeginTest();
	public Results results = new Results();
	
	
	public void forcedStop() {
		Android.adb.forceStopApp(packageId());
	}

	public Object open() {
		Android.adb.openAppaActivity(packageId(), activityId());
		return null;
	}

	public void clearData() {
		Android.adb.clearAppsData(packageId());
	}

	public String packageId() {
		return "org.zwanoo.android.speedtest";
	}

	public String activityId() {
		
		return "com.ookla.speedtest.softfacade.MainActivity";
	}


}
