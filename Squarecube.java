import java.util.Scanner;
public class Squarecube {
public static void main(String[] args)
{
    int square,cube,n ;
    Scanner s = new Scanner(System.in);

    System.out.println("Enter Value of n");
    n = s.nextInt();

    square = n * n ;
    {
        System.out.println("SQUARE OF NUMBER = " +square);
    }

    cube = n * n * n ;
   { 
       System.out.println("CUBE OF NUMBER = " +cube);
   }


}
    
}
