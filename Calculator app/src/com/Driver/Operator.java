/**
 * 
 */
package com.Driver;
import java.util.Iterator;
import java.util.Scanner;


import com.Arthematic.*;
import com.BMI.BMI;
import com.BMR.BMR;
import com.Mensuration.*;
import com.Percentage.Percentage;
/**
 * @author Pratikshit Chowdhury
 *
 */
public class Operator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arthemetic arth = new Arthemetic();
		Mensuration mn = new Mensuration();  
		BMI bmi = new BMI();
		BMR bmr = new BMR();
		Percentage per = new Percentage();
		
     System.out.println("------Welcome to the Calculator Portal------");
     System.out.print("We provide a vriety of Calculation operations.");
     System.out.println("Pick your choice of calculation from the list below : ");
    
		/*
		 * System.out.println("1. Arthimatic"); System.out.println("2. BMI");
		 * System.out.println("3. Mensuration"); System.out.println("4. Percentage");
		 * System.out.println("5. BMR");
		 */
     String choice[] = {"1.Arthimatic", "2.BMI","3.Mensuration", "4.Percentage", "5.BMR", "0.Log Out"};
     
     for (int i = 0; i < choice.length; i++) {
		
    	 System.out.println(choice[i]);
	}
     
	Scanner sc= new Scanner(System.in);
	int in = sc.nextInt();
	switch(in)
	{
	case 1 : System.out.println("You have chosen the Arthimatic operator");
	System.out.println("Choose your sub operator from the list below: ");
	        // in = sc.nextInt();
	        
	        int sub_choice = sc.nextInt();
	        
	        switch(sub_choice) {
			 case 1 : arth.Addition();
			 break;
			 case 2 : arth.Subtraction();
			 break;
			 case 3 : arth.Multiplication();;
			 break;
			 case 4 : arth.Division();
			 
			 }
	         break;
	case 2 : System.out.println("You have chosen the BMI operator");
	         bmi.calcBMI();
	         in = sc.nextInt();
	         return;
	case 3:  System.out.println("You have chosen the Mensuration operator");
	         mn.Selection();
	          in = sc.nextInt();
	         switch(in)
	         {	        	 
	case 1: mn.Squarecalc(in); 
	         break;
	         
	case 2:	 mn.Rectcalc(in,in); 
	         break;
	case 3: mn.Triangle(in, in, in);
	         break;
	case 4: mn.Circle(in);
	        break;	 
	        
	default : System.out.println("sorry unavaible");
             
	     break;
	         }
	         break;
	         
	case 4: System.out.println("You have chosen the % operator");

	System.out.println("Choose the type of percentage calculation you would like to use" );
	System.out.println("For solo number press 1");
	System.out.println("For two numbers press 2");
	int input = sc.nextInt();
	switch(input) {
	
	case 1 : 
		per.Percentcalcsolo(input);
			break;
	case 2 :
		per.Percentcalc(input, input);
		break;
			
			
	}
	break;
	 			
	 			
	        
	        
	case 5: System.out.println("You have chosen the BMR opeator");
	         bmr.option();
	         in = sc.nextInt();
	         switch(in) {
	         case 1 :  System.out.println("Hello Gentleman : ");    
	        	 bmr.maleBMR(in, in, in);
   	      in = sc.nextInt();
   	      break;
   	          
	         case 2 : System.out.println("Hello beautiful : "); 
	        	 bmr.femaleBMR(in, in, in);
	         in = sc.nextInt();
	   	      break;
	         }
	case 0 : System.out.println("Type ok to close");
	String confirm = " ";
	if (confirm == sc.next()) {
		sc.close();	
	}
	        	  break; 
	         
	        
    
	        
	
	default : System.out.println("---Sorry :(---"+ "Inavlid input");
	        break;	
	}
	
	
	
	}

}
