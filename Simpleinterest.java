import java.util.Scanner;
public class Simpleinterest {
     public static void main(String[] args)
     {
         int Principal,Rate,Year,Simpleinterest;
         Scanner s = new Scanner(System.in);

         System.out.println("Enter Principal value");
         Principal = s.nextInt();

         System.out.println("Enter Rate value");
         Rate = s.nextInt();

         System.out.println("Enter Year Value");
         Year = s.nextInt();

         Simpleinterest = (Principal * Rate * Year)/100;
         System.out.println(Simpleinterest);    
     }
    
}
