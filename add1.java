import java.util.Scanner;
public class add1 {
    public static void main(str[] args)
    {
        int sum =0,N;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter How Many Digit Add \n -:");
        N = s.nextInt();

        for(int i=1;i<N;i++)
        {
            sum += i;
        }
        System.out.print(+sum);

    }
}
