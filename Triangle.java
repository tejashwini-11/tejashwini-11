package javaProjects;
import java.util.Scanner;

	public class Triangle 
	{
	    public static void main(String[] args)
	    {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter three angles (in degrees):");
	        System.out.print("Angle 1: ");
	        int angle1 = scanner.nextInt();
	        System.out.print("Angle 2: ");
	        int angle2 = scanner.nextInt();
	        System.out.print("Angle 3: ");
	        int angle3 = scanner.nextInt();
	        boolean canFormTriangle = isTriangle(angle1, angle2, angle3);
	       if (canFormTriangle) 
	       {
	            System.out.println("These angles can form a triangle.");
	        } 
	       else 
	       {
	            System.out.println("These angles cannot form a triangle.");
	        }
	        
	        scanner.close();
	    }
	    
	  public static boolean isTriangle(int angle1, int angle2, int angle3) 
	  {
	    return (angle1 + angle2 + angle3 == 180);
	}
	}


	