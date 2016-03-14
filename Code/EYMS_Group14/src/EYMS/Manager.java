package EYMS;

import javax.swing.JPasswordField;

public class Manager extends User {

	public Manager(String userName, String firstName, String lastName, String password) {
		super(userName, firstName, lastName, password);
		// TODO Auto-generated constructor stub
	}
	void seeMeals(){
		
	}
	//Set a new Meal
	@Override
	public Meal accessMeal() {
		Meal newMeal = new Meal();
		return null;
	}
	@Override
	public void setUserName() {
		// TODO Auto-generated method stub
		
	}
}
