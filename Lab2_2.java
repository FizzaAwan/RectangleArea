import java.util.Scanner;

/**
   A program that prompts for the height and width of a rectangle
   and prints the area of that rectangle.  
   All variables should be of type double.
*/

public class Lab2_2
{
   public static void main (String[] args)
   {
      Scanner in = new Scanner(System.in);
      
      // Display prompt for rectangle width
      System.out.print("Please enter the width of the rectangle: ");

      // Read width of rectangle
      double width = in.nextDouble();

      // Display prompt for rectangle height
      
      System.out.print("Please enter the height of the rectangle: ");

      double height = in.nextDouble();
      
      double area = height*width;
      
      System.out.println(area);
      
      

   }
}
