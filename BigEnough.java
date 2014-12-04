package day6;

import java.util.Scanner;

public class BigEnough {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		EmployeesArrays ea = new EmployeesArrays ();
		
		System.out.println("Enter ID and name of employee : ");
		
		ea.enterId(sc.nextInt());
		ea.enterName(sc.nextLine());
		
		
	}

}
