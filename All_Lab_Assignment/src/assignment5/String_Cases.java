/*
Lab Assignment 4
@Name : Rakhee Gaikwad
@Date : 10 Nov 2022

Program 2:- Str1="HeLlo" change cases of string.
*/

package assignment5;
//declaring a class String_Cases 
public class String_Cases 
{
	//calling main method
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		 String str="HeLlo"; // string
		 System.out.println("String Case : "+str);	// printing str HeLlo
	      StringBuffer Str1=new StringBuffer(str);   //StringBuffer method 
	          
	   // using for loop
	      for(int i = 0; i < str.length(); i++) 
	      {    
	              
	          //Checking for lower case character    
	          if(Character.isLowerCase(str.charAt(i))) 
	          {    
	              //Convert String LowerCase into UpperCase    
	              Str1.setCharAt(i, Character.toUpperCase(str.charAt(i)));    
	          }    
	          //Checking for upper case character    
	          else if(Character.isUpperCase(str.charAt(i)))
	          {    
	        	//Convert String UpperCase into LowerCase  
	              Str1.setCharAt(i, Character.toLowerCase(str.charAt(i)));    
	          }    
	      }    
	      //end for loop
	      System.out.println("Converted String Case : " + Str1);    //printing Str1 after converting
	  }
	//end of main method
}
	//end of class String_Cases
	

		
	







  