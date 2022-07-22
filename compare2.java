import java.util.Scanner;
public class compare2 {
  public static void main(String[] args)
  {
      int a,b;
      Scanner s = new Scanner(System.in);

      System.out.println("Enter Value of a");
      a = s.nextInt();

      System.out.println("Enter value of b");
      b = s.nextInt();

      if(a>b)
      {
          System.out.println("A greater than B");
      }
      else
      {
          System.out.println("B greater than A");
      }
  }    
}
