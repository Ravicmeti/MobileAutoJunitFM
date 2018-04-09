package api.apps.fieldez.expense;

import org.openqa.selenium.NoSuchElementException;

import core.MyLogger;

public class Expense {

	public ExpenseUiObjects uiObject = new ExpenseUiObjects();
	public PolicyUiObjects uiObject1 = new PolicyUiObjects();
	public CreateExpenseUiObjects uiObject2 = new CreateExpenseUiObjects();
	
	//Methods for Policy page
	public void clickViewExpPolicy(){
		try{
			MyLogger.log.info("Clicking View Expense policy ");
			uiObject.viewPolicy().tap();
			
		}catch(NoSuchElementException e){
			 throw new AssertionError("Can't get View Expense policy,element not present or blocked");
		}
	}
	
	public void clickViewExpPolicyBack(){
		try{
			MyLogger.log.info("Clicking Back on Expense policy ");
			uiObject1.viewExpPolicyBack().tap();
			
		}catch(NoSuchElementException e){
			 throw new AssertionError("Can't get View Expense policy,element not present or blocked");
		}
	}
	
	//Methods for Search Expense
	public void clickSearchLink(){
		try{
			MyLogger.log.info("Clicking on Search link ");
			uiObject.searchExp().tap();
			
		}catch(NoSuchElementException e){
			 throw new AssertionError("Can't get Search link,element not present or blocked");
		}
	}
	
	public void clickBackOnSearch(){
		try{
			MyLogger.log.info("Clicking Back on Search Expense");
			uiObject.backOnSearch().tap();
			
		}catch(NoSuchElementException e){
			 throw new AssertionError("Can't get View Expense policy,element not present or blocked");
		}
	}
	
	public void enterSearchString(String txt){
		try{
			MyLogger.log.info("Entering Search string");
			uiObject.searchString().typeText(txt);
			
		}catch(NoSuchElementException e){
			 throw new AssertionError("Can't get View Expense policy,element not present or blocked");
		}
	}
	
	//Methods for Create Expense 
	
	public void clickAddExpense(){
		try{
			MyLogger.log.info("Clicking Add Expense");
			uiObject.addExp().tap();
			
		}catch(NoSuchElementException e){
			 throw new AssertionError("Can't get View Expense policy,element not present or blocked");
		}
	}
	
	public void enterDate(){
		try{
			MyLogger.log.info("Select Expense date");
			uiObject2.calendar().tap();
			uiObject2.calOK().tap();
		}catch(NoSuchElementException e){
			 throw new AssertionError("Can't get View Expense policy,element not present or blocked");
		}
	}
	
	public void clickTagCall(){
		try{
			MyLogger.log.info("Click Tag calls");
			uiObject2.tagCallLink().tap();
		}catch(NoSuchElementException e){
			 throw new AssertionError("Can't get View Expense policy,element not present or blocked");
		}
	}
	
	public void clickCancel(){
		try{
			MyLogger.log.info("Clicking CANCEL");
			uiObject2.calCANCEL();
		}catch(NoSuchElementException e){
			 throw new AssertionError("Can't get View Expense policy,element not present or blocked");
		}
	}
	
	public void clickAddItemLink(){
		try{
			MyLogger.log.info("Clicking Add Item link");
			uiObject2.addItemLink().tap();
		}catch(NoSuchElementException e){
			 throw new AssertionError("Can't get View Expense policy,element not present or blocked");
		}
	}
	
	public void clickBackOnAddItem(){
		try{
			MyLogger.log.info("Clicking Back on Add Item page");
			uiObject2.backOnAddItem().tap();
		}catch(NoSuchElementException e){
			 throw new AssertionError("Can't get View Expense policy,element not present or blocked");
		}
	}
	
	public void clickCancelAddItem(){
		try{
			MyLogger.log.info("Clicking Cancel from adding item");
			uiObject2.backOnAddItem().tap();
			uiObject2.confirmYES().tap();
		}catch(NoSuchElementException e){
			 throw new AssertionError("Can't get View Expense policy,element not present or blocked");
		}
	}
	
	public void clickSaveExp(){
		try{
			MyLogger.log.info("Clicking SAVE expense");
			uiObject2.saveExp().tap();
		}catch(NoSuchElementException e){
			 throw new AssertionError("Can't get View Expense policy,element not present or blocked");
		}
	}
	
	
}
