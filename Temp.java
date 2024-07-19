package javaProjects;
import java.util.Scanner;

		public class Temp
		{
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        
		     System.out.print("Enter temperature in Fahrenheit: ");
		     double fahrenheit = scanner.nextDouble();
		     double celsius = (fahrenheit - 32) * 5 / 9;
		        
		      System.out.printf("Temperature in Celsius: %.2f%n", celsius);
		       if (celsius <= 0)
		       {
		            System.out.println("It's very cold!");
		        }
		       else if (celsius > 0 && celsius <= 15)
		       {
		            System.out.println("It's cold.");
		        }
		       else if (celsius > 15 && celsius <= 25)
		       {
		            System.out.println("It's mild.");
		        }
		       else if (celsius > 25 && celsius <= 35)
		       {
		            System.out.println("It's warm.");
		        }
		       else 
		       {
		            System.out.println("It's hot!");
		        }
		        
		        scanner.close();
		    }
		}

