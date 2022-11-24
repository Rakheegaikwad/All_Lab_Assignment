/*
 Lab Assignment 7
@Name : Rakhee Gaikwad
@Date : 24 Nov 2022

Program 3:- Read data from text file and print words whose length is greater than 5 character.

 */


package assignment7;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

//decalring a class FileHandling 
public class FileHandling {
	
	//calling of main method
	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		//taking variable
		int ch,i;
		FileInputStream fis=new FileInputStream("D:\\Lab\\demo1.txt"); 
		String s="";
		//using while loop
		while((ch=fis.read())!=-1)
		{
		s=s+(char)ch;
		}
		String str[]=s.split(" "); //split method
		//using for loop
		for(i=0;i<str.length;i++)
		{
		if(str[i].length()>5) 
		{
		System.out.println(str[i]); //printing words length whose greater than 5
		}
		
		}
	//	end for loop
		

	}
	//end of main method
}
//end of class FileHandling 

/*
Output=

Anudip
Foundation
FullStack
Training

*/