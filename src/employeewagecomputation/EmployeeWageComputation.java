package employeewagecomputation;

import java.util.Random;

public class EmployeeWageComputation {

	public static void main(String[] args) {
		
		int attendance;
		int employeeType;
		int monthlyWage = 0;
		final int WAGE_PER_HR = 20;
		final int PART_TIME_HR = 4;
		final int FULL_TIME_HR = 8;
		final int DAY_PER_MONTH = 20;
		int hours = 0;
		int fullTimePresentDay = 0;
		int partTimePresentDay = 0;
		
		System.out.println("Welcome to Employee wage computation");
		for(int i=0; i < DAY_PER_MONTH; i++) {
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
					hours += PART_TIME_HR;
					partTimePresentDay++;
				break;
				
				case 1:
					System.out.println("Employee is full timer");
					hours += FULL_TIME_HR;
					fullTimePresentDay++;
					
				break;
				default:
					System.out.println("Not a Employee");
				}
				
			break;
			default:
				System.out.println("Invalid Number");
			
			}
			System.out.println();
		}
		
		monthlyWage = hours * WAGE_PER_HR;
		System.out.println("Full time Days in month "+ fullTimePresentDay);
		System.out.println("Part time Days in month "+ partTimePresentDay);
		System.out.println("Employee Wage = "+monthlyWage);
	}

}
