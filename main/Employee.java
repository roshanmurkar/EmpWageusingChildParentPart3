package main;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Employee {
	//parent variable
	protected int randomNumber;
	protected int wagePerHour=40;
	protected int fullDayHour=16;
	protected int partTimeHour=20;
	protected double dailyWage;
	protected double partTimeEmployeeWage;

	
	//generating random number
	protected void getRandomNumber() {
		randomNumber=(int) (Math.random()*2+1);
	}
	
	public static final Logger logger=Logger.getLogger("employee");
	
	//switch case
		public void employeeWageUsingSwitch() {
			logger.log(Level.INFO,"\n press 1 for employee Daily Wage\n press 2 for employee Part time Wage");
			logger.log(Level.INFO,"Enter number from above options :-");
			
			Scanner getValue = new Scanner(System.in);
			int selectOption = getValue.nextInt();
			
			switch (selectOption) {
			case 1: {
				dailyWage=wagePerHour*fullDayHour;
				logger.log(Level.INFO," employee Daily wage "+ dailyWage +" RS");
				System.out.println("-----------------------------------------------------");
				break;
			}
			case 2: {
				partTimeEmployeeWage=wagePerHour*partTimeHour;
				logger.log(Level.INFO,"Part time employee wage "+ partTimeEmployeeWage +" RS");
				System.out.println("-----------------------------------------------------");
				break;
			}
			default:
				System.out.println("wrong option");
			}
		}
	
	
}
