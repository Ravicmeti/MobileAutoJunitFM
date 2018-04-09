package api.apps.fieldez;

import api.android.Android;
import api.apps.fieldez.expense.Expense;
import api.apps.fieldez.home.Home;
import api.apps.fieldez.login.Login;

import api.interfaces.Application;

public class Feztest implements Application {
	public Login login = new Login();
	public Home home = new Home();
	public Expense expense = new Expense();
	
	
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
		return "com.fieldez.mobile";
	}

	public String activityId() {
		return "com.fieldez.android.ui.activities.LoginActivity";
	}

	static public Feztest getObject() {
		return new Feztest();
	}
	
}
