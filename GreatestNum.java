package javaProjects;
import java.util.Scanner;

public class GreatestNum
{

	public static void main(String[] args)
	{
				   
		        Scanner scanner = new Scanner(System.in);
		        int[] numbers = new int[5];
		        System.out.println("Enter five numbers:");
		        for (int i = 0; i < 5; i++)
		        {
		            numbers[i] = scanner.nextInt();
		        }
		        
		        int greatest = numbers[0];
		        for (int i = 1; i < 5; i++) 
		        {
		            if (numbers[i] > greatest)
		            {
		                greatest = numbers[i];
		            }
		        }
		        System.out.println("The greatest number is: " + greatest);
		        
		        scanner.close();
		}
}
