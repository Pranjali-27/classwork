import java.util.*;
class prime_no
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);

   System.out.print("Enter number: ");
    int n=sc.nextInt();
     
     int i=2;
     do
      {
          if(n==i)
          {
       System.out.println("number is prime number");
           } 
      if(n%i==0)
          break;
          i++;
        }while(i<=n);
  


}
}
output:

C:\Users\AT SYSTEMS\SkyDrive\Documents\dowhile>javac prime_no.java

C:\Users\AT SYSTEMS\SkyDrive\Documents\dowhile>java prime_no
Enter number: 11
number is prime number

C:\Users\AT SYSTEMS\SkyDrive\Documents\dowhile>