import java.util.Scanner;
public class compare1 {
    public static void main(String[] args)
    {
        int a,b,c;
        Scanner s = new Scanner(System.in);

        System.out.println("Enter Value of a");
        a = s.nextInt();
    
        System.out.println("Enter Value of b");
        b = s.nextInt();

        System.out.println("Enter Value of c");
        c = s.nextInt();

        if(a>b)
        {
            System.out.println(c*c);
        }
        else if(b>c)
        {
            System.out.println(a*a);
        }
        else if(c>a)
        {
            System.out.println(b*b);
        }
        else
        {
            System.out.println(a*b*c);
        }
    }
    
}
