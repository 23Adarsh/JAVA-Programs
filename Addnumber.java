import java.util.Scanner;
public class Addnumber {
        public static void main(String[] args)
    {
        int n,sum=0;
        Scanner s = new Scanner(System.in);

        System.out.println("Enter value of N");
        n = s.nextInt();

        for(int i=1;i<=n;i++)
        {
            sum = sum+i;
        }
        System.out.println("ADDITION OF NUMBER = " + sum);
    }
    
}
    

