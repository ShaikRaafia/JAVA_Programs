import java.util.Scanner;
public class Stdin
{
public static void main(String[] args)
{
  Scanner scan=new Scanner(System.in);
  System.out.println("Enter an Integer");
  int a=scan.nextInt();
  System.out.println("Enter a Double");
  double d=scan.nextDouble();
  System.out.println("Enter a String");
   scan.nextLine();
   String s=scan.nextLine();
    System.out.println("String:" +s);
    System.out.println("Double:" +d);
    System.out.println("Int:" +a);
}
}
