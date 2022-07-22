import java.util.Scanner;
public class MAX3 {
    public static void main(String[] args)
    {
        int num1,num2,num3;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter First Number:\n =");
        num1 = s.nextInt();

        
        System.out.print("Enter Second Number:\n =");
        num2 = s.nextInt();
        
        
        System.out.print("Enter Third Number:\n =");
        num3 = s.nextInt();

        if(num1>num2&&num1>num3)
        {
            System.out.print("NUM1 is Greatest Number All Numbers:\n ="+num1);
        }
        else if(num2>num1&&num2>num3)
        {
            System.out.print("NUM2 is Greatest Number All Number:\n ="+num2);

        }
        else if(num3>num1&&num3>num2)
        {
            System.out.print("NUM3 is Greatest Number All Number:\n ="+num3);
        }
        else
        {
            System.out.print("Error");
        }
        
      
    }
    
}
