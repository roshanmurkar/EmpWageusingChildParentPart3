package main;

import java.util.logging.Level;
import java.util.logging.Logger;

public class EmpChild extends Employee {

	//initialize logger
	public static final Logger logger=Logger.getLogger("empWage");	
	//check employee attendance
	protected void EmployeeAttendance() {
		if(randomNumber==1) {
			logger.log(Level.INFO,"Employee present");	
		}else {
			logger.log(Level.INFO,"Employee absent");
		}
	}

	
	//calculating daily wage of employee
	protected double DailyEmployeeWage() {
		double dailyWage=wagePerHour*fullDayHour;
		logger.log(Level.INFO,"daily employee wage is :-"+dailyWage+" /- Rs");
		return dailyWage;
	}
	//calculating daily wage of part time employee
	protected void partTimeEmployeeWage() {
		double partTimeEmployeeWage=wagePerHour*partTimeHour;
		logger.log(Level.INFO,"Part time employee wage :-"+partTimeEmployeeWage+" /- Rs");

	}
	
	//calculating monthly employee wage
	protected void WagesForMonth() {		
		totalWageForMonth=workingDays*dailyWage;
		logger.log(Level.INFO,"total wages for month - "+totalWageForMonth+" RS");		
	}
}

