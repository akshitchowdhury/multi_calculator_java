package com.Arthematic;
import java.util.Scanner;
public class Arthemetic {
	public void Addition() {
		System.out.println("You have selected the addition operator. ");
		System.out.println("Please enter the 1st number: ");
		Scanner art = new Scanner(System.in);
		double num1 = art.nextDouble();
		System.out.println("Enter your 2nd number: ");
		double num2 = art.nextDouble();
		double res = num1+num2;
		System.out.println("Your result is "+ res);
		
	}
	public void Subtraction() {
		System.out.println("You have selected the subtraction operator. ");
		System.out.println("Please enter the 1st number: ");
		Scanner art = new Scanner(System.in);
		double num1 = art.nextDouble();
		System.out.println("Enter your 2nd number: ");
		double num2 = art.nextDouble();
		double res = num1-num2;
		System.out.println("Your result is "+ res);
		
	}
	public void Multiplication() {
		System.out.println("You have selected the multiplication operator. ");
		System.out.println("Please enter the 1st number: ");
		Scanner art = new Scanner(System.in);
		double num1 = art.nextDouble();
		System.out.println("Enter your 2nd number: ");
		double num2 = art.nextDouble();
		double res = num1*num2;
		System.out.println("Your result is "+ Math.round(res));
		
	}
	public void Division() {
		System.out.println("You have selected the division operator. ");
		System.out.println("Please enter the 1st number: ");
		Scanner art = new Scanner(System.in);
		double num1 = art.nextDouble();
		System.out.println("Enter your 2nd number: ");
		double num2 = art.nextDouble();
		double res = num1/num2;
		System.out.println("Your result is "+ Math.round(res));
		
	}
}
