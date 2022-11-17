/*
 Lab Assignment 6
@Name : Rakhee Gaikwad
@Date : 17 Nov 2022

Program 3:- Create two thread.one thread is finding average of first 50
number and other thread is printing square of number store in 
array arr={10,15,20,25,30}.
 */


package assignment6;

//declaring a class Thread_Average_Sqaure
public class Thread_Average_Sqaure implements Runnable 
{
	//calling run method
	public void run()
	{

		int num=50;  //taking 50 numbers
		int sum=0;	//initialize sum as 0
		
		// using for loop
		for(int i=0;i<50;i++)
		{
			sum +=i;
		}
		int avg=sum/num;	//sum of average
		System.out.println("Average of 50 Numbers "+avg); //printing average of 50 numbers 
	}
	//end of run method
	
	//calling main method
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Thread_Average_Sqaure obj1=new Thread_Average_Sqaure(); //creating obj of class Thread_Average_Sqaure
		obj1.run();     //calling run method
		
		int[] arr={10,15,20,25,30}; //array elements
		int square=0;				//initialize square as 0
		
		//using for loop
		for (int i=0;i< arr.length;i++) 
		{
			arr[i] = (int)Math.pow(arr[i], 2);
		}
		for (int value : arr) 
		{
			System.out.println("Main thread is running "+Thread.currentThread().getName()+value);
		}
		
	}
	//end main method

}
//end of main method

/*
 * output=
 Average of 50 Numbers 24
Main thread is running main100
Main thread is running main225
Main thread is running main400
Main thread is running main625
Main thread is running main900
 */
