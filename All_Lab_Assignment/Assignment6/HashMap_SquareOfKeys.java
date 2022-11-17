/*
 Lab Assignment 6
@Name : Rakhee Gaikwad
@Date : 17 Nov 2022

Program 2:- Create Hash Map whose key are 1 to 15 and its values
square of keys(use for loop). 

 */
package assignment6;

import java.util.HashMap;
import java.util.Map;

//declaring a class HashMap_SquareOfKeys 
public class HashMap_SquareOfKeys 
{
	//calling main method
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Map<Integer,Integer> data=new HashMap<>();
		//using put method
		data.put(1, 1); //key(int) and value(int)
		data.put(2, 4);
		data.put(3, 9);
		data.put(4, 16);
		data.put(5, 25);
		data.put(6, 36);
		data.put(7, 42);
		data.put(8, 64);
		data.put(9, 81);
		data.put(10, 110);
		data.put(11,121);
		data.put(12, 144);
		data.put(13, 169);
		data.put(14, 196);
		data.put(15,225);
		
		
		
		//using for  loop
				for(Integer K:data.keySet())
				System.out.println("Key  :"+K+" Sqaure value  :"+data.get(K)); 	//printing key and square value
				
				
	}
	//end main method
	}
//end of a class HashMap_SquareOfKeys 


/*
 * output=
 Key is  1 , Sqaure value is 1
Key is  2 , Sqaure value is 4
Key is  3 , Sqaure value is 9
Key is  4 , Sqaure value is 16
Key is  5 , Sqaure value is 25
Key is  6 , Sqaure value is 36
Key is  7 , Sqaure value is 42
Key is  8 , Sqaure value is 64
Key is  9 , Sqaure value is 81
Key is  10 , Sqaure value is 110
Key is  11 , Sqaure value is 121
Key is  12 , Sqaure value is 144
Key is  13 , Sqaure value is 169
Key is  14 , Sqaure value is 196
Key is  15 , Sqaure value is 225

 */


