/*
 Lab Assignment 6
@Name : Rakhee Gaikwad
@Date : 17 Nov 2022

Program 1:-  Define Agent class with name,Name,Id,Area and sort it Area wise
(use Comparable interface).
 */

package asignment_6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


//declaring a class Collections_Comparable 
public class Collections_Comparable {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		List<Agent> adata=new ArrayList<>();
		//using add method
		adata.add(new Agent(1001,"Keshav","Pune"));	// adding agent id(int),agent name(String),agent area(String)
		adata.add(new Agent(1002,"Manish","Mumbai"));
		adata.add(new Agent(1003,"Nishant","Nanded"));
		adata.add(new Agent(1004,"Akshay","Ahmadabad"));
		
		Collections.sort(adata); //sorting method for adata
		//using for loop
		for(Agent o:adata)
		{
			System.out.println("Agent Id  :-"+o.getA_Id()+" Agent Name  :-"+o.getA_Name()+" Agent Area  :-"+o.getA_Area());		 //printing agentid,agent name,agentarea
		}
		//end of for loop
	}
	//end of main method
}
//end of class	 Collections_Comparable 

	//declaring a class agent iterface Comparable
		class Agent implements Comparable<Agent>
		{
			//instance veriable
			private int a_Id;	
			private String a_Name;
			private String a_Area;
			
			//using Comparto method for comparing String
			public int compareTo(Agent o) {
				
				// TODO Auto-generated method stub
				return this.a_Area.compareToIgnoreCase(o.a_Area);
			}
			//using getter setter method for instance variable
			public int getA_Id() {
				return a_Id;
			}

			public void setA_Id(int a_Id) {
				this.a_Id = a_Id;
			}

			public String getA_Name() {
				return a_Name;
			}

			public void setA_Name(String a_Name) {
				this.a_Name = a_Name;
			}

			public String getA_Area() {
				return a_Area;
			}

			public void setA_Area(String a_Area) {
				this.a_Area = a_Area;
			}
			
			//creating Constructor with superclass for instance variables 
			public Agent(int a_Id, String a_Name, String a_Area) {
				super();
				this.a_Id = a_Id;
				this.a_Name = a_Name;
				this.a_Area = a_Area;
			}
			
		}
		//end a class agent iterface Comparable
		
		/*
		 output =
		 Agent Id  :-1004 Agent Name  :-Akshay Agent Area  :-Ahmadabad
		 Agent Id  :-1002 Agent Name  :-Manish Agent Area  :-Mumbai
		 Agent Id  :-1003 Agent Name  :-Nishant Agent Area  :-Nanded
		 Agent Id  :-1001 Agent Name  :-Keshav Agent Area  :-Pune
		 
		*/
	



