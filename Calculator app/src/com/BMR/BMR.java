/**
 * 
 */
package com.BMR;

import java.util.Scanner;
/**
 * @author Pratikshit Chowdhury
 *
 */
public  class BMR {
	Scanner br = new Scanner(System.in);
	
public void option() {
	System.out.println("Please select your gender : ");
	
	System.out.println("1.For male press '1' ");
	System.out.println("2. For female press '2' ");
	//int option = br.nextInt();
	
}
public void maleBMR(float ht, int wt, int age) {
	System.out.println("Please enter your weight in kg: ");
	wt = br.nextInt();
	System.out.println("Pease enter your height in cms: ");
	ht = br.nextFloat();
	System.out.println("Please enter your age in years: ");
	age = br.nextInt();
	double res = (double) ((13.397*wt) + (4.799*ht) - (5.677*age) + 88.362); 
 
			
	 System.out.println("You require " + res+ " calories per day ");
	
}
public void femaleBMR(float ht, int wt, int age) {
	System.out.println("Please enter your weight in kg: ");
	wt = br.nextInt();
	System.out.println("Pease enter your height in cms: ");
	ht = br.nextFloat();
	System.out.println("Please enter your age in years: ");
	age = br.nextInt();
	double res = (double) ((9.247*wt) + (3.098*ht) - (4.330*age) + 447.593); 
			
	 System.out.println("You require " + res+ " calories per day ");
	
}
}