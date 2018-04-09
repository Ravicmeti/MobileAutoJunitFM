package api.apps.fieldez.expense;

import core.UiObject;
import core.UiSelector;

public class CreateExpenseUiObjects {
	
	private static UiObject saveExp,backOncreateExp,calendar,selectToday,calCANCEL,calOK,tagCallLink,addItemLink,backOnAddItem,confirmNO,confirmYES;

	public UiObject saveExp(){
		if(saveExp == null) saveExp = new UiSelector().resourceId("com.fieldez.mobile:id/menu_done").makeUiObject();
		return saveExp;
	}
	public UiObject backOncreateExp(){
		if(backOncreateExp == null) backOncreateExp = new UiSelector().description("Navigate up").makeUiObject();
		return backOncreateExp;
	}
	public UiObject calendar(){
		if(calendar == null) calendar = new UiSelector().resourceId("com.fieldez.mobile:id/fromDate").makeUiObject();
		return calendar;
	}
	public UiObject selectToday(){
		if(selectToday == null) selectToday = new UiSelector().selected(true).makeUiObject();
		return selectToday;
	}
	public UiObject calCANCEL(){
		if(calCANCEL == null) calCANCEL = new UiSelector().text("Cancel").makeUiObject();
		return calCANCEL;
	}
	public UiObject calOK(){
		if(calOK == null) calOK = new UiSelector().text("Ok").makeUiObject();
		return calOK;
	}
	public UiObject tagCallLink(){
		if(tagCallLink == null) tagCallLink = new UiSelector().resourceId("com.fieldez.mobile:id/button1").makeUiObject();
		return tagCallLink;
	}
	public UiObject addItemLink(){
		if(addItemLink == null) addItemLink = new UiSelector().resourceId("com.fieldez.mobile:id/add_line_item").makeUiObject();
		return addItemLink;
	}
	public UiObject backOnAddItem(){
		if(backOnAddItem == null) backOnAddItem = new UiSelector().description("Navigate up").makeUiObject();
		return backOnAddItem;
	}
	public UiObject confirmNO(){
		if(confirmNO == null) confirmNO = new UiSelector().resourceId("android:id/button2").makeUiObject();
		return confirmNO;
	}
	public UiObject confirmYES(){
		if(confirmYES == null) confirmYES = new UiSelector().resourceId("android:id/button1").makeUiObject();
		return confirmYES;
	}
	

}
