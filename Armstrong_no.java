import java.util.*;
class Armstrong_no
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int i;
int sum=0;
int rem=0;
   System.out.print("Enter  4 digit number: ");
    int n=sc.nextInt();
      i=n;
  do
{
      System.out.println("given no.is Armstrong number:");
            
           if(sum==n)
           rem=i%10;
          sum=sum+(rem*rem*rem);
          i=i/10;
          }while(i!=0);
  



}
}
output:


C:\Users\AT SYSTEMS\SkyDrive\Documents\dowhile>javac Armstrong_no.java

C:\Users\AT SYSTEMS\SkyDrive\Documents\dowhile>java Armstrong_no
Enter  4 digit number: 1634
given no.is Armstrong number:
C:\Users\AT SYSTEMS\SkyDrive\Documents\dowhile>