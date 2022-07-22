import java.util.Scanner;
public class signed{
    public static void main(String[] args)
    {
        int num;
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter Number:\n =");
        num = s.nextInt();
        
        if(num>0)
        {
            System.out.print("It's Positive Number");
        }
        else
        {
            System.out.print("It's Negative Number");
        }
    }
}