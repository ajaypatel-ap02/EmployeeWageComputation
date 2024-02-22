package employeewagecomputation;

import java.util.Random;

public class EmployeeWageComputation {
	int attendance;
	int employeeType;
	int monthlyWage = 0;
	int workingHours = 0;
	int workingDay = 1;
	int wagePerHr;
	final int PART_TIME_HR = 4;
	final int FULL_TIME_HR = 8;
	int dayPerMonth;
	int hrPerMonth;
	
	public void employeeWageCalc() {
		System.out.println("Welcome to Employee wage computation");
		
		while(workingHours <= hrPerMonth && workingDay <= dayPerMonth) {
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
		
		monthlyWage = workingHours * wagePerHr;
	
		System.out.println("Employee full month Wage = "+ monthlyWage);
	}


	public EmployeeWageComputation(int wagePerHr, int dayPerMonth, int hrPerMonth) {
		this.wagePerHr = wagePerHr;
		this.dayPerMonth = dayPerMonth;
		this.hrPerMonth = hrPerMonth;
	}


	public static void main(String[] args) {
		
		EmployeeWageComputation company1 = new EmployeeWageComputation(25, 22, 120);
		company1.employeeWageCalc();
		
		EmployeeWageComputation company2 = new EmployeeWageComputation(22, 20, 95);
		company2.employeeWageCalc();
		
		EmployeeWageComputation company3 = new EmployeeWageComputation(19, 19, 100);
		company3.employeeWageCalc();
	
	}
}