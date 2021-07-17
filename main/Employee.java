package main;

public class Employee {
	//parent variable
	protected int randomNumber;
	protected int wagePerHour=40;
	protected int fullDayHour=16;
	protected int partTimeHour=20;

	
	//generating random number
	protected void getRandomNumber() {
		randomNumber=(int) (Math.random()*2+1);
	}
	
	
}
