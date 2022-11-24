/*
 Lab Assignment 7
@Name : Rakhee Gaikwad
@Date : 24 Nov 2022

Program 1:- Define Student class with id,name,age,math's marks
and print students marks and print marks of student between 60 to 80(StreamAPI)

 */
package assignment7;

import java.util.ArrayList;
import java.util.List;

//declaring a class Student
class Student
{
	//instance variable
	private int s_Id;
	private String s_Name;
	private int s_Age;
	private int s_math_marks;
	
	//no argument constructor
	public Student() 
	{

	}
	
	//Parameterized constructor
	public Student(int s_Id, String s_Name, int s_Age, int s_math_marks) {
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

//declaring a class StreamAPI_Student_Marks
public class StreamAPI_Student_Marks {
	
	//calling main method
	public static void main(String[] args)
	{
		
		List<Student>sdata=new ArrayList<Student>(); //creating array list
		// using add method and giving input
		sdata.add(new Student(101,"Sonal",23,60));
		sdata.add(new Student(1002,"Rakhee",24,75));
		sdata.add(new Student(1003,"Minal",25,85));
		sdata.add(new Student(1004,"Aboli",24,78));
		sdata.add(new Student(1005,"Rajshree",25,89));
		sdata.add(new Student(1006,"Aditi",23,56));
		
 //comparing marks using filter And printing student Id,Name,Age,printing marks of student between 60 to 80
sdata.stream().filter(p ->p.getS_math_marks()>=60&&p.getS_math_marks()<=80).forEach(s ->System.out.println(s.getS_Id()+" "+s.getS_Name()+" "+s.getS_Age()+" " +s.getS_math_marks()));
		
		
	}
	//end of main method

}
//end of class StreamAPI_Student_Marks 

/*
Output=

Marks of All Student
S_Id :- 101   S_Name :-Sonal     S_Age :-23  S_Math_Marks  :-60
S_Id :- 1002  S_Name :-Rakhee    S_Age :-24  S_Math_Marks  :-75
S_Id :- 1003  S_Name :-Minal     S_Age :-25  S_Math_Marks  :-85
S_Id :- 1004  S_Name :-Aboli     S_Age :-24  S_Math_Marks  :-78
S_Id :- 1005  S_Name :-Rajshree  S_Age :-25  S_Math_Marks  :-89
S_Id :- 1006  S_Name :-Aditi     S_Age :-23  S_Math_Marks  :-56

Marks of student between 60 to 80
S_Id :-101   S_Name :-Sonal   S_Age :-23   S_Math_Marks :-60
S_Id :-1002  S_Name :-Rakhee  S_Age :-24   S_Math_Marks :-75
S_Id :-1004  S_Name :-Aboli   S_Age :-24   S_Math_Marks :-78


*/
	
