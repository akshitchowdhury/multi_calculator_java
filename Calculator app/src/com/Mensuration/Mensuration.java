/**
 * 
 */
package com.Mensuration;
import java.util.Scanner;
/**
 * @author Pratikshit Chowdhury
 *
 */
public class Mensuration {
public void Selection() {
	System.out.println("Choose which sub operation would you like to perform : ");
	System.out.println("1. Square [Area/Perimeter]");
	System.out.println("2. Rectangle[Area/Perimeter]");
	System.out.println("3. Triangle[Area/Perimeter]");
	System.out.println("4. Circle[Area/Perimeter]");
	Scanner sl = new Scanner(System.in);
	 
	 
}
	public void Squarecalc(int a) {
	
		System.out.println("You have Selected the square function. ");
		System.out.println("Please select the sub function you would like to use : ");
		System.out.println("1) Calculate Area");
		System.out.println("2) Calculate Perimeter");
		Scanner sq = new Scanner(System.in);
		int op = sq.nextInt(); 
		switch(op) {
		case 1 :  System.out.println("Enter the length for the area to be calculated");
				  a = sq.nextInt();
				  long area = a*a;
				  System.out.println("Area of Square is : "+ area);
				  break;
		case 2 : System.out.println("Enter the length for the perimeter to be calculated");
				 a = sq.nextInt();
				 long perimeter = 2*a;
				 System.out.println("Perimeter of Square is : "+ perimeter);	
				 break;
		default : System.out.println("Invaid input...Sorry...");}
	}
		
		public void Rectcalc(int r, int R) {
			
			System.out.println("You have Selected the Rectangle function. ");
			System.out.println("Please select the sub function you would like to use : ");
			System.out.println("1) Calculate Area");
			System.out.println("2) Calculate Perimeter");
			Scanner rc = new Scanner(System.in);	
			int op = rc.nextInt(); 
			switch(op) {
			case 1 :  System.out.println("Enter the length for the area to be calculated");
					  r = rc.nextInt();
					  System.out.println("Enter the breadth for the area to be calculated");
					  
					  R = rc.nextInt();
					  long area = r*R;
					  System.out.println("Area of Rectangle is : "+ area);
					  break;
			case 2 : System.out.println("Enter the length for the perimeter to be calculated");
					 r = rc.nextInt();
					 System.out.println("Enter the breadyh for the perimeter to be calculated");
					 R = rc.nextInt();
					 long perimeter = (2*r)+(2*R);
					 
					 System.out.println("Perimeter of Rectangle is : "+ perimeter);
		             break; 	
			default : System.out.println("Invaid input...Sorry...");}
		}
		public void Triangle(int l, int b, int h) {
			
			System.out.println("You have Selected the Triangle function. ");
			System.out.println("Please select the sub function you would like to use : ");
			System.out.println("1) Calculate Area");
			System.out.println("2) Calculate Perimeter");
			Scanner tr = new Scanner(System.in);	
			int op = tr.nextInt(); 
			switch(op) {
			case 1 :  System.out.println("Enter the height for the area to be calculated");
					  h = tr.nextInt();
					  System.out.println("Enter the breadth for the area to be calculated");
					  
					  b = tr.nextInt();
					  long area = (long)0.5*(b+h);
					  System.out.println("Area of Triangle is : "+ area);
					  break;
			case 2 : System.out.println("Enter the length for the perimeter to be calculated");
					 l = tr.nextInt();
					 System.out.println("Enter the breadth for the perimeter to be calculated");
					 b = tr.nextInt();
					 System.out.println("Enter the height for the perimeter to be calculated");
					 h = tr.nextInt();
					 long perimeter = l+b+h;
					 
					 System.out.println("Perimeter of Triangle is : "+ perimeter);
		             break; 	
			default : System.out.println("Invaid input...Sorry...");}
		}
			public void Circle(int c) {
				
				System.out.println("You have Selected the Circle function. ");
				System.out.println("Please select the sub function you would like to use : ");
				System.out.println("1) Calculate Area");
				System.out.println("2) Calculate Perimeter");
				Scanner cr = new Scanner(System.in);	
				int op = cr.nextInt(); 
				switch(op) {
				case 1 :  System.out.println("Enter the Radius for the area to be calculated");
						  c = cr.nextInt();
						   
						   long area = (long)3.14*c;
						  System.out.println("Area of Circle is : "+ area);
						  break;
				case 2 : System.out.println("Enter the raius for the Circumference to be calculated");
						 c = cr.nextInt();
						 long perimeter =  (long) ((long)2*3.14*c);
						 
						 System.out.println("Circumference of Circle  is : "+ perimeter);break;
				
				default : System.out.println("Invaid input...Sorry...");}
	
	
	
	
	

	
	
	
	
	}
	
	
	
			
}

