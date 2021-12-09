import java.util.*;
import java.io.*;
public class Primenumber
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    if(n==2||n==3)
    {
     System.out.println("Prime Number");
    }
    else if(n%2==0)
    {
     System.out.println("Not a PrimeNumber");
    }
    else if(n%3==0)
    {
      System.out.println("Not a PrimeNumber");
    }
     else if(n%4==0)
     {
       System.out.println("Not a PrimeNumber");
     }
      else
      {
        System.out.println("PrimeNumber");
      }
      sc.close();
    }
}