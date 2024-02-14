package employeewagecomputation;

import java.util.Random;

public class EmployeeWageComputation {

	public static void main(String[] args) {
		
		int attendance;
		int employeeType;
		int dailyWage = 0;
		final int WAGE_PER_HR = 20;
		final int PART_TIME_HR = 4;
		final int FULL_TIME_HR = 8;
		
		System.out.println("Welcome to Employee wage computation");
		
		Random random=new Random();
		attendance = random.nextInt(10) % 2 ;
		
		switch(attendance) {
		case 0:
			System.out.println("Employee is absent");
		break;
		
		case 1:
			System.out.println("Employee is present");
			
			employeeType = random.nextInt(10) % 2;
			switch(employeeType) {
			case 0:
				System.out.println("Employee is part timer");
				dailyWage = WAGE_PER_HR * PART_TIME_HR;
			break;
			
			case 1:
				System.out.println("Employee is full timer");
				dailyWage = WAGE_PER_HR * FULL_TIME_HR;
			break;
			default:
				System.out.println("Not a Employee");
			}
			System.out.println("Employee Wage = "+dailyWage);
		break;
		default:
			System.out.println("Invalid Number");
		
		}
	}

}
