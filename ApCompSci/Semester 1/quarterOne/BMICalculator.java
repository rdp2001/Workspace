package quarterOne;

import java.util.Scanner;

public class BMICalculator {

	public static void main(String[] args) {
		String s = "0";
		Scanner sc = new Scanner(System.in);
		while(!(s.equals("1")||s.equals("2"))){
			System.out.println("Which units would you like to use? [1: Metric System, 2: Imperial System]");
			s = sc.nextLine();
			if(!(s.equals("1")||s.equals("2"))){
				System.out.println("Please Enter 1 or 2.");
			}
		}
		
		if(s.equals("1")){
			System.out.print("Please enter your height in meters: ");
			double h = sc.nextDouble();
			System.out.print("Please enter your weight in kilograms: ");
			double w = sc.nextDouble();
			System.out.println("Your BMI is "+(w/(h*h)));
		}else{
			System.out.print("Please enter your height in inches: ");
			double h = sc.nextDouble();
			System.out.print("Please enter your weight in pounds: ");
			double w = sc.nextDouble();
			System.out.println("Your BMI is "+(703*w/(h*h)));
		}
	}

}
