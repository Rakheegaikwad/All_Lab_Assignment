/*
  Lab Assignment 8
@Name : Rakhee Gaikwad
@Date : 1 nov 2022

Program 2:- Calculate electricity Bill.
if units up to 100  charges =1.20 per unit
100 to 300
Charges=2 per unit
otherwise 3rs per unit.
*/

package assigment8;

import java.util.Scanner;

//declaring a class Electricity_Bill
public class Electricity_Bill {

	//calling main method
	public static void main(String[] args) 
	{
	
		//declaring variables
		int unit;
		double bill;
		
		Scanner obj = new Scanner(System.in);
		System.out.println(" Please Enter your units consumed: ");
		unit = obj.nextInt();
		
		//checking units consumed
		if (unit <=100) {
			bill = unit * 1.20;
		}
		else if (unit <= 300) {
			bill = 100 * 1.20+ (unit-100) * 2;
		}
		else {
			bill = 100 * 1.20 + 200 * 2 + (unit-300) * 3;
		}
		
		//printing electricity bill
		System.out.println("Your electricity bill is: " + bill);
				
		obj.close(); //closing scanner
	}
	//end for main method
}
//end of class Electricity_Bill

/*

Output =
Please Enter your units consumed: 
89
Your electricity bill is: 106.8
/*

