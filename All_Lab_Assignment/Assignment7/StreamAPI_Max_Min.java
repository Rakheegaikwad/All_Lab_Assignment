/*
 Lab Assignment 7
@Name : Rakhee Gaikwad
@Date : 24 Nov 2022

Program 2:- Find maximum and minimum marks using max() and min() method in above example.

 */
package assignment7;

import java.util.ArrayList;
import java.util.List;


//declaring a class Student1
class Student1
{
	//instance variable
	private int s_Id;
	private String s_Name;
	private int s_Age;
	private int s_math_marks;
	
	//no argument constructor
	public Student1() 
	{

	}
	//Parameterized constructor
	public Student1(int s_Id, String s_Name, int s_Age, int s_math_marks) {
		super();
		this.s_Id = s_Id;
		this.s_Name = s_Name;
		this.s_Age = s_Age;
		this.s_math_marks = s_math_marks;
	}
	//using Getter setter method
	public int getS_Id() {
		return s_Id;
	}
	public void setS_Id(int s_Id) {
		this.s_Id = s_Id;
	}
	public String getS_Name() {
		return s_Name;
	}
	public void setS_Name(String s_Name) {
		this.s_Name = s_Name;
	}
	public int getS_Age() {
		return s_Age;
	}
	public void setS_Age(int s_Age) {
		this.s_Age = s_Age;
	}
	public int getS_math_marks() {
		return s_math_marks;
	}
	public void setS_math_marks(int s_math_marks) {
		this.s_math_marks = s_math_marks;
	}
	
}
//end of class student

//declaring a class StreamAPI_Example1
public class StreamAPI_Example2 {
	//calling main method
	public static void main(String[] args) 
	{
		//creating array list
		List<Student1>sdata=new ArrayList<Student1>();
		// using add method and giving input
		sdata.add(new Student1(101,"Sonal",23,60));
		sdata.add(new Student1(1002,"Rakhee",24,75));
		sdata.add(new Student1(1003,"Minal",25,85));
		sdata.add(new Student1(1004,"Aboli",24,78));
		sdata.add(new Student1(1005,"Rajshree",25,89));
		sdata.add(new Student1(1006,"Aditi",23,56));
		
		//for finding max marks
		Student1 ST=sdata.stream().max((student1,student2)->student1.getS_math_marks()>student2.getS_math_marks()?1:-1).get(); //comparing Student1 ,student2
			System.out.println("Student Maximum Marks"); 	//printing Student Maximum Marks
			System.out.println("S_id"+ST.getS_Id()+" "+ST.getS_Name()+" "+ST.getS_Age()+" "+ST.getS_math_marks());
			
			System.out.println(); //printing blank line
			
		//for finding min marks
		Student1 SD=sdata.stream().min((student1,student2)->student1.getS_math_marks()>student2.getS_math_marks()?1:-1).get();
			System.out.println("Student Minimum Marks"); 	//printing Student Minimum Marks
			System.out.println(SD.getS_Id()+" "+SD.getS_Name()+" "+SD.getS_Age()+" "+SD.getS_math_marks());


	}
	//end of main method

}
//end of class StreamAPI_Max_Min

/*
OutPut =

Student Maximum Marks
S_Id :-1005  S_Name :-Rajshree  S_Age :-25 S_Math_Marks :-89

Student Minimum Marks
S_Id :-1006   S_Name :-Aditi  S_Age :-23  S_Math_Marks :-56

*/
