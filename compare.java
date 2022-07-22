import java.util.Scanner;
public class compare {
    public static void main(String[] args)
    {
        int a , b ;
        Scanner s = new Scanner(System.in);

        System.out.println("Enter Value of a");
        a = s.nextInt();

        System.out.println("Enter Value of b");
        b = s.nextInt();

        if(a>b)
        {
            System.out.println(a+b);
        }
        else
        {
            System.out.println(a-b);
        }
    }
    
}
