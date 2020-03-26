package com.qa.main;

public class Results 
{
	public double chemistryMark = 123.00;
	public double physicsMark = 131.00;
	public double biologyMark = 97.00;
	public double totalMarks = chemistryMark + physicsMark + biologyMark;
	public double percentageOfMarks;
	
	public void showStudentsMarks()
	{
		System.out.println("Your chemistry marks: " + chemistryMark);
		System.out.println("Your physics marks: " +  physicsMark);
		System.out.println("Your biology marks: " + biologyMark);
		System.out.println("Your total marks: " + totalMarks);
		
		percentageOfMarks = totalMarks * 100 / 450;
		System.out.println(percentageOfMarks);
	}

}