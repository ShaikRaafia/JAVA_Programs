import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Endoffile
{
  public static void main(String[] args)
  {
     String s="Hello world\nI am a file\nRead me until end-of-file";
     Scanner scan=new Scanner(s);
     for (int i=1; scan.hasNext(); i++ )
          System.out.println(i+ " "+scan.nextLine());
   }
}