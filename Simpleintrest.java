package javaProjects;

public class Simpleintrest 
{

	public static void main(String[] args) 
	{
		double principal = 10000; 
		double rate = 5; 
		double time = 3; 
        double simpleInterest = (principal * rate * time) / 100;

		 System.out.println("Principal: " + principal);
		 System.out.println("Rate of Interest: " + rate + "%");
		 System.out.println("Time Period: " + time + " years");
		 System.out.println("Simple Interest: " + simpleInterest);
	  }
}
