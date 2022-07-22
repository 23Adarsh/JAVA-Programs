import java.util.Scanner;
public class work {
    public static void main(String[] args)
    {
        int w1,w2,t1,t2,p1,p2;
        Scanner s = new Scanner(System.in);

        System.out.println("Enter value of P1");
        p1 = s.nextInt();

        System.out.println("Enter value of P2");
        p2 = s.nextInt();

        System.out.println("Enter value of T1");
        t1 = s.nextInt();

        System.out.println("Enter value of T2");
        t2 = s.nextInt();

        w1 = p1 * t1;
        System.out.println(w1);

        w2 = p2 * t2 ;
        System.out.println(w2);

        
        if(w1>w2)
        {
            System.out.println(w2);
        }
        else
        {
            System.out.println(w1);

        }

    }
    
}
