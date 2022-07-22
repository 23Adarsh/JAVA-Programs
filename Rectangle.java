import java.util.Scanner;
public class Rectangle {
   public static void main(String[] args)
   {
       int length,breadth,Rectangle;
       Scanner s = new Scanner(System.in);

       System.out.println("Enter value of length");
       length = s.nextInt();

       System.out.println("Enter value of breadth");
       breadth = s.nextInt();

       Rectangle = length * breadth;

       System.out.println(Rectangle);
   } 
}
