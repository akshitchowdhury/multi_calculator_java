/**
 * 
 */
package com.BMI;
import java.util.Scanner;
/**
 * @author Pratikshit Chowdhury
 *
 */
public class BMI {
public void calcBMI() {
	Scanner bm = new Scanner(System.in);
	System.out.println("Please enter your weight in kgs : ");
	int wt = bm.nextInt();
	System.out.println("Please enter your height in m : ");
	double ht = bm.nextDouble();
	int res = (int) ((int) wt/(ht*ht));

	System.out.println("Your bmi is : " + res);

	if(res<18.5) 
	 {System.out.println("You are Underweight");}
	
	else if(18.5<=res && res<=24.9)
	{ System.out.println("You are Healthy");
	} 

	else if(25>=res && res<=29.9) 
	{ System.out.println("You are Overweight");}

	else if(30>=res && res<=34.9) 
	{ System.out.println("You are Obeise Lv1");}
    
	else if(35>=res && res<=39.9) 
	{ System.out.println("You are Obeise Lv2");}
    
	else if(res>40 ) 
	{ System.out.println("You are Obeise Lv3");}

	
	else 
	{System.out.println("you are abnormal");}
	}
	
	
	
//	//if(res<18.5) {
//	
//		System.out.println("Your BMI is "+ res);
//		System.out.println("You are underweight");
//		
//		
//	}
//     
//	else if(res>18.5)
//	
//	 { System.out.println("Your BMI is "+ res);
//		System.out.println("You are fine");
//	 }
//	else if(res>25)
//		 
//	{System.out.println("Your BMI is "+ res);
//	System.out.println("You are Overweight");
//	}
//	else if(res<29)
// 
//		{System.out.println("Your BMI is "+ res);
//		System.out.println("You are Overweight");
//		}
//	
//	else if (res>30)
//	 {
//		System.out.println("Your BMI is "+ res);
//		System.out.println("You are Obeise Lv1");
//		}
//	
//
//	else if (res>35)
//	
//	 {
//		System.out.println("Your BMI is "+ res);
//		System.out.println("You are Obeise Lv2");
//		}
//
//	else if(res>40)
//	
//		{System.out.println("Your BMI is "+ res);
//		System.out.println("You are Obeise Lv3");
//		}
//
//	else 
//		System.out.println("Goodbye");
//
	}

