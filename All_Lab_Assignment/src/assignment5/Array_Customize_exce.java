/*
Lab Assignment 5
@Name : Rakhee Gaikwad
@Date : 10 Nov 2022

Program 1:- Create array of 5 elements and through customize exception of zeromembererror if user enter 0 as a aaray member
*/

package assignment5;
import java.util.Scanner;


//declaring a class Array_Customize_exce
public class Array_Customize_exce {
	

	public static void checkNumberError(int num) throws ZeroNumberError
	{
			
				int arr[]= {1,2,3,4,5};	//array elements
				for(int i=0;i<arr.length;i++) 
				{
					if(arr[i]<0)
					{
						System.out.println("Valid input");	//printing valid inpunt
						
					}
					else
					{
						
						throw new ZeroNumberError("Invalid input");	// printing Invalid input
					}
				}		

			}
	//calling main method
			public static void main(String[] args) 
			{
				// TODO Auto-generated method stub
				Scanner obj=new Scanner(System.in);
				int number=obj.nextInt();
				
				//try and catch method
				try 
				{
				checkNumberError(number);
				}
				catch(ZeroNumberError e)
				{
					e.printStackTrace();
				}
				//end try and catch method
			}
			//end  main method
	}
//End of  a class Array_Customize_exce

/*
Output-
assignment5.ZeroNumberError: Invalid input
	at All_Lab_Assignment/assignment5.Array_Customize_exce.checkNumberError(Array_Customize_exce.java:31)
	at All_Lab_Assignment/assignment5.Array_Customize_exce.main(Array_Customize_exce.java:46)

*/
