package api.interfaces;

public interface Application {

	void forcedStop();
	Object open();
	void clearData();
	String packageId();
	String activityId();
//	Integer version();
}
