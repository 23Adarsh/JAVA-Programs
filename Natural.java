import java.util.Scanner;
public class Natural {
    public static void main(String[] args)
    {
        int n;
        Scanner s = new Scanner(System.in);

        System.out.println("Enter Value of N");
        n = s.nextInt();
        
        for(int i=1;i<=n;i++)
        {
            System.out.println(i +" ");
        }
    }
    
}
