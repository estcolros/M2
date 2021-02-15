package Milestones;

import java.util.Scanner;

public class JobsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean bonus=true;
		double ajut=100;
		if (ajut>300) {
			ajut=300;
		}
		
		Scanner scn = new Scanner(System.in);
		Boss a = new Boss("Jefe",8000,bonus);
		//Employee b = new Employee("Empleado");
		Manager c = new Manager("Manager", 4000,bonus);
		Volunteer d = new Volunteer("Voluntario",0);
		
		Senior seniors[] = new Senior[2];
		Mid mids[] = new Mid[2];
		Junior juniors[] = new Junior[2];
		
		seniors[0]= new Senior("Manolo", 3000,bonus);
		seniors[1]= new Senior("Pepe", 3000,bonus);
	
		mids[0]= new Mid("Maria", 2000,bonus);
		mids[1]= new Mid("Marta", 2000,bonus);
		
		juniors[0]= new Junior("Adan", 5000,bonus);
		juniors[1]= new Junior("Eva", 1000,bonus);
		
		for (int i = 0; i < juniors.length; i++) {
			System.out.println(juniors[i].toString());
			
		}
		
	}

}