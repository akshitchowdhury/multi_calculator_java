package com.Percentage;

import java.util.Scanner;

public class Percentage {

	public static  void Percentcalcsolo(float num1){
		
		
		Scanner per = new Scanner (System.in)
;
		System.out.println("Enter the numbers whose % is to be calculated ");
		num1 = per.nextFloat();
		float res = num1*100;
		System.out.println("The desired result is " + res + "%");
		}
	
	
	
	public static  void Percentcalc(float num1, float num2){
		
		Scanner per = new Scanner(System.in);
		System.out.println("Enter the numbers whose % is to be calculated ");
		
		System.out.println("Enter the 1st number ");
		 num1 = per.nextFloat();
		
		System.out.println("Enter the 2nd number ");
		 num2 = per.nextFloat();
		
		float res = (num1/num2)* 100;
		
		System.out.println("The desired result is " + res+"%");
		
		
	}
	
}
