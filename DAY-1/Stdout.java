import java.util.Scanner;
public class Stdout
{
public static void main(String[] args)
{
        Scanner sc=new Scanner(System.in);
        System.out.println("==================================");
        for (int i=0;i<3;i++)
        {
          String s=sc.next();
          int x=sc.nextInt();
          System.out.println(""+s+"         "+x+"");
        }
        System.out.println("==================================");
}
}
