/*
  Lab Assignment 8
@Name : Rakhee Gaikwad
@Date : 1 nov 2022

Program 1:- Write a program to print the area of two circle having radius 4 and 
20 respectively by creating a class named 'circle' with a method named 'Area' which 
returns the area and radius passed to its constructor.

 */

package assigment8;

//declaring a class Circle
public class Circle 
{
	//variable 
	 double radius;
	    double area;
	 
	    public Circle(double radius)  //radius passed to its constructor.
	    {
	        this.radius = radius;
	    }
	 
	    public double Area() //creating Area Method
	    {
	        area = 3.14 * radius * radius;
	        return area;
	    }

	    //calling main method
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Circle c1 = new Circle(4);
        System.out.println("The area of circle with radius 4 is: " + c1.Area()); //printing Area Of circle One
 
        Circle c2 = new Circle(20);
        System.out.println("The area of circle with radius 20 is: " + c2.Area()); //printing Area Of circle two
	}
	 //end of  main method
}
//end of  a class Circle





/*
Output =
The area of circle with radius 4 is: 50.24
The area of circle with radius 20 is: 1256.0
*/