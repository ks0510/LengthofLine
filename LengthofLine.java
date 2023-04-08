package practice;
import java.util.*;

/**
 * 
 * @author Kaif
 *
 */

public class GeometryLine {
	/**
	 * This method is created for calculating the Length of lines using 
	 * cartesian system,comparing length of lines
	 * @param args
	 */

	public static void main(String[] args) {
		
		/*
		 *1)Get the first coordinates of line from  user input
		 *2)Get the second coordinates of line from  user input
		 *3)Calculate length of line by Mathematical functions 
		 */
	
		System.out.println("Welcome to Line Comparison Computation Program");
		
                Scanner sc = new Scanner(System.in);
		
		/*
		 * 1) Get the first co-ordinate of line from  user input
		 */
		
		System.out.println("Enter the first co-ordinate of line");
		int x1=sc.nextInt();
		int y1=sc.nextInt();
		
		/*
		 * 2)Get the second co-ordinate of line from  user input
		 */
		
		System.out.println("Enter the Second co-ordinate of line");
		
		int x2=sc.nextInt();
		int y2=sc.nextInt();
		
		/*
		 * 3)Calculate length of line by Mathematical functions
		 */
		
		double x = Math.pow((x2-x1), 2);
                double y = Math.pow((y2-y1), 2);
                int length1 = (int) Math.sqrt(x+y);
        
                System.out.println("Length of line is "+length1);
        
		         
     }
}
