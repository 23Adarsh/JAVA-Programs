import java.util.Scanner;
public class Circle {
 public static void main(String[] args)
 {
     int radius ;
     double Perimeter,Area;

     Scanner s = new Scanner(System.in);

     System.out.println("Enter Radius value");
     radius = s.nextInt();

    Perimeter = 2*3.14*radius;
    System.out.println(Perimeter);

    Area = 3.14*radius*radius;
    System.out.println(Area);
 }    
}
