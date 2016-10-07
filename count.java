import java.io.*;
import java.util.*;
class count
     {
      public static void main()
      {
      int count=0;
      Scanner sc=new Scanner(System.in);
      int x=sc.nextInt();
      int d=0;
      while(x>0)
      {
      count++;
      x=x/10;
      }
      System.out.println(count);
    }
   }
      
      
