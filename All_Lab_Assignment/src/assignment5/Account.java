/*
Lab Assignment 5
@Name : Rakhee Gaikwad
@Date : 10 Nov 2022

Program 3:- Create an Account class with private account, name,balance and generate simple banking application
of withdraw amount and display on screen.

*/


package assignment5;
import java.util.Scanner;
public class Account 
{
	//instance veriable
	private int acc_Id;
	private String  acc_Name;
	private  long balance;
	
	
	
	
	public int getAcc_Id() 
	{
		return acc_Id;
	}

	public void setAcc_Id(int acc_Id) 
	{
		this.acc_Id = acc_Id;
	}

	public String getAcc_Name() 
	{
		return acc_Name;
	}

	public void setAcc_Name(String acc_Name) 
	{
		this.acc_Name = acc_Name;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}
	
	

	public Account() 
	{
		super();
	}
	
	public void withdraw() //method
	{
		
		double withdrawamt=5000;	 //withdrawing 5000 amt from account
		// if else statement
		if(balance<withdrawamt)  //balance is less than withdraw amt
		{
		System.out.println("Insufficeint amount");	//printing Insufficent amount
		}
		else 
		{
			System.out.println("withdraw Amount 5000");	//printing withdraw Amount 5000
		}
		
		balance=(long) (balance-withdrawamt);
		System.out.println("Available balance:"+balance);
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("*************Banking Application************");
		//creating obj1 of Account class
		Account obj1=new Account();			
		obj1.setAcc_Id(10001);			//calling obj1 Acc_Id
		obj1.setAcc_Name("Rakhee Gaikwad"); 	//calling obj1 Acc_Name
		obj1.setBalance(35000);			//calling obj1 Balance
		obj1.withdraw();			//calling obj1 withdraw method
		
		//creating obj2 of Account class
		Account obj2=new Account();
		obj2.setAcc_Id(10012);
		obj2.setAcc_Name("Rajshree Gaikwad");
		obj2.setBalance(48500);
		obj2.withdraw();
		
		//creating obj3 of Account class
		Account obj3=new Account();
		obj3.setAcc_Id(10026);
		obj3.setAcc_Name("Pratiksha Kamble");
		obj3.setBalance(38000);
		obj3.withdraw();
		
		//printing Acc_Id+Acc_Name+Balance
System.out.println("Accoount Id :- "+obj1.getAcc_Id()+ "  Account Holder Name :- "+obj1.getAcc_Name()+"	Account Balance :-"+obj1.getBalance());
System.out.println("Accoount Id :- "+obj2.getAcc_Id()+ "  Account Holder Name :- "+obj2.getAcc_Name()+"	Account Balance :-"+obj2.getBalance());;
System.out.println("Accoount Id :- "+obj3.getAcc_Id()+ "  Account Holder Name :- "+obj3.getAcc_Name()+"	Account Balance :-"+obj3.getBalance());
	
}
	//end main method
}

//end of class Account
  

/*
Output -

*************Banking Application************
withdraw Amount 5000
Available balance:30000
withdraw Amount 5000
Available balance:43500
withdraw Amount 5000
Available balance:33000
Accoount Id :- 10001  Account Holder Name :- Rakhee Gaikwad	Account Balance :-30000
Accoount Id :- 10012  Account Holder Name :- Rajshree Gaikwad	Account Balance :-43500
Accoount Id :- 10026  Account Holder Name :- Pratiksha Kamble	Account Balance :-33000
*/
	


