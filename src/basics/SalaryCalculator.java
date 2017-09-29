package basics;

public class SalaryCalculator {

	public static void main(String[] args){
		
		String career;
		career = "Software Developer";
		System.out.println("Program is starting");
		System.out.println("My Career is " + career);
		int hoursPerWeek = 40;
		int weeksPerYear = 50 ;
		double rate = 42.50;
		
		double salary = hoursPerWeek * weeksPerYear * rate;
		System.out.println("My Salary as a " + career+ "at a rate of "+rate+" is " + salary );
	}
}
