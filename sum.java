import java.io.*;
import java.util.*;
class sum
    {
    public static void main(String agrgs[])
     {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int sum=0;
    int x=0;
    while(n>0)
    {
    x=n%10;
    sum=sum+x;
    n=n/10;
    }
    System.out.println(sum);
    }
    }
