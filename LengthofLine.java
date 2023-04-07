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
                 *4)Get the length of another line from user input
		 *5)Converting lengths of both lines L1 and L2 into objects for using equals(),compareTo() methods
		 *6)To Check the lengths of two lines are equal or not using equals() method 
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
                int L1 = (int) Math.sqrt(x+y);
        
                System.out.println("Length of line is "+L1);
        
		/*
                *4)Get the length of another line from user input
                */
        
                System.out.println("Enter Length of Line 2");
        
                int L2=sc.nextInt();
        
               /*
               * 5)Converting lengths of both lines L1 and L2 into objects for using equals(),compareTo() methods
               */
        
               Integer obj1 = new Integer(L1);
               Integer obj2 = new Integer(L2);
        
               /*
               *6)To Check the lengths of two lines are equal or not using equals() method
               */
        
               boolean Result=obj1.equals(obj2);
        
               if(Result) {
        	   System.out.println("Lengths of both lines are equal");
               }
               else {
        	   System.out.println("Lenghts of both lines are different");
               }         
     }
}
