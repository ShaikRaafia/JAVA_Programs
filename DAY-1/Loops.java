import java.util.Scanner;
class Loops
{
public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
if(n>=2&&n<=20)
{
for(int i=0;i<=10;i++)
{
System.out.println(n+" x "+i+" = "+n*i);
}
}
}
}