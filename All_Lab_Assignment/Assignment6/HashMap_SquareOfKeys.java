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
				for(Integer Value:data.keySet())
				System.out.println("Key  "+Value+" Sqaure value  "+data.get(Value)); 	//printing key and square value
				
				
	}
	//end main method
	}
//end of a class HashMap_SquareOfKeys 


/*
 * output=
 Key  1 Sqaure value  1
Key  2 Sqaure value  4
Key  3 Sqaure value  9
Key  4 Sqaure value  16
Key  5 Sqaure value  25
Key  6 Sqaure value  36
Key  7 Sqaure value  42
Key  8 Sqaure value  64
Key  9 Sqaure value  81
Key  10 Sqaure value  110
Key  11 Sqaure value  121
Key  12 Sqaure value  144
Key  13 Sqaure value  169
Key  14 Sqaure value  196
Key  15 Sqaure value  225

 */


