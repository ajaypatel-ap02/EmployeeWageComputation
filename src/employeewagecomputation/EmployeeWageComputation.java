package employeewagecomputation;

import java.util.Random;

public class EmployeeWageComputation {

	public static void main(String[] args) {
		
		int attendance;
		int employeeType;
		int dailyWage;
		final int WAGE_PER_HR = 20;
		final int PART_TIME_HR = 4;
		final int FULL_TIME_HR = 8;
		
		System.out.println("Welcome to Employee wage computation");
		
		Random random=new Random();
		attendance = random.nextInt(10) % 2 ;
		
		if(attendance==0) {
			System.out.println("Employee is absent");
		}
		else {
			
			System.out.println("Employee is present");
			
			employeeType = random.nextInt(10) % 2;
			if(employeeType==0) {
				System.out.println("Employee is part timer");
				dailyWage = WAGE_PER_HR * PART_TIME_HR;
			}
			else {
				System.out.println("Employee is full timer");
				dailyWage = WAGE_PER_HR * FULL_TIME_HR;
			}
			
			System.out.println("Employee Wage = "+dailyWage);
		}
	}

}
