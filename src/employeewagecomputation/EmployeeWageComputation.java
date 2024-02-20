package employeewagecomputation;

import java.util.Random;

public class EmployeeWageComputation {
	int attendance;
	int employeeType;
	int monthlyWage = 0;
	int workingHours = 0;
	int workingDay = 1;
	final int WAGE_PER_HR = 20;
	final int PART_TIME_HR = 4;
	final int FULL_TIME_HR = 8;
	final int DAY_PER_MONTH = 20;
	final int HR_PER_MONTH = 100;
	
	public void employeeWageCalc() {
		System.out.println("Welcome to Employee wage computation");
		
		while(workingHours <= HR_PER_MONTH && workingDay <= DAY_PER_MONTH) {
			Random random= new Random();
			attendance = random.nextInt(10) % 2 ;
			
			System.out.println("Day : "+workingDay);
			switch(attendance) {
				
			case 0:
				
				System.out.println("Employee was absent");
			
			break;
			
			case 1:
			
			
				
				System.out.println("Employee was present");
				
				employeeType = random.nextInt(10) % 2;
				
				switch(employeeType) {
				case 0:
					
					System.out.println("Employee worked part time");
				
					workingHours += PART_TIME_HR;
					
				break;
				
				case 1:
				
					System.out.println("Employee worked full time");
					
					workingHours += FULL_TIME_HR;
					
					break;
				}
				
			break;
			
			}
			System.out.println("---------------------------");
			++workingDay;
			
		}
		
		monthlyWage = workingHours * WAGE_PER_HR;
	
		System.out.println("Employee full month Wage = "+ monthlyWage);
	}


	public static void main(String[] args) {
		EmployeeWageComputation employeeWageComputation = new EmployeeWageComputation();
		employeeWageComputation.employeeWageCalc();
	}
}