import java.util.Scanner;
public class table{
  public static void main(String[] args)
  {
     Scanner s = new Scanner(System.in);

     System.out.print("Table are 1 to N \n");

     System.out.print("Enter Table Rows -:");
     int n = s.nextInt();

     System.out.print("Enter Table COloumn -: ");
     int m = s.nextInt();

     for(int i=1;i<=m;i++)
     {
      for(int j=1;j<=n;j++)
      {
        System.out.print(+i*j+" ");
      }
       System.out.println();
      
     }
  }
}

