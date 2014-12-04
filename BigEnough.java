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
		
		for (int i = 0; i < ea.getSizeId(); i++) {
			
			if (ea.getIdArray()[i]%2==0) {
				System.out.println(ea.getIdArray()[i]);
				System.out.println(ea.getNameArray()[i]);
			}
			
			if (ea.getNameArray()[i].charAt(0)=='S') {
				System.out.println(ea.getIdArray()[i]);
				System.out.println(ea.getNameArray()[i]);
			}
		}
		

	}

		
	
}
