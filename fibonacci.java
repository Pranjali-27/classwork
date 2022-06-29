
import java.util.*;
class fibonacci
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
 
  int a=0;
  int b=1;
 System.out.println("Enter the Number");
  int n=sc.nextInt();
System.out.println(a +"");
 System.out.println(b +"");
 int i=3;
 int c=0;
           do
           {
             
         System.out.println(c +" ");
              c=a+b;
              a=b;
              b=c;
             i++;
            }while(i<=n);
    
}
}
output:

C:\Users\AT SYSTEMS\SkyDrive\Documents\dowhile>javac fibonacci.java
fibonacci.java:20: error: variable c might not have been initialized
         System.out.println(c +" ");
                            ^
1 error

C:\Users\AT SYSTEMS\SkyDrive\Documents\dowhile>javac fibonacci.java

C:\Users\AT SYSTEMS\SkyDrive\Documents\dowhile>java fibonacci
Enter the Number
13
0
1
0
1
2
3
5
8
13
21
34
55
89

C:\Users\AT SYSTEMS\SkyDrive\Documents\dowhile>