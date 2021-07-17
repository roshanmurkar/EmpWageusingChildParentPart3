package main;

public class EmpWage {
	//main method
	public static void main(String[] args) {
		
		//creating object for child class
		EmpChild employeeData=new EmpChild();
		//getting random number
		employeeData.getRandomNumber();
		//checking for employee attendance
		employeeData.EmployeeAttendance();
		//getting daily employee wage
		employeeData.DailyEmployeeWage();
		//getting part time employee wage
		employeeData.partTimeEmployeeWage();
		
	}
}	

