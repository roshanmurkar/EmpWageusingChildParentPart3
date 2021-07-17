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
}
