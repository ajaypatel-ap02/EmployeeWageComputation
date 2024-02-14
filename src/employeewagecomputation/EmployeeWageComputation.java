package employeewagecomputation;

import java.util.Random;

public class EmployeeWageComputation {

	public static void main(String[] args) {
		
		int attendance;
		int dailyWage;
		final int WAGE_PER_HR = 20;
		final int FULL_DAY_HR = 8;
		System.out.println("Welcome to Employee wage computation");
		
		Random random=new Random();
		attendance = random.nextInt(10) % 2 ;
		if(attendance==0) {
			System.out.println("Employee is absent");
		}
		else {
		
			System.out.println("Employee is present");
			dailyWage = FULL_DAY_HR * WAGE_PER_HR; 
			System.out.println("Employee Wage = "+dailyWage);
		}
	}

}
