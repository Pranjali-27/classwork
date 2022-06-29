import java.util.*;
class Reverse_no

  {

      public static void main(String[]args)

        {
         
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter Number To Reverse");

     int n=sc.nextInt();

      int rev=0, rem;
        
     for(int i=n;i!=0;i=i/10)
      

	
     {

      rem=i%10;
       
        rev=(rev*10)+rem;

       
      }
         
         System.out.println("Reverse of Number: " +rev);
                 }

     }

   
Output:

C:\Users\AT SYSTEMS\SkyDrive\Documents\forloop>javac Reverse_no.java

C:\Users\AT SYSTEMS\SkyDrive\Documents\forloop>java Reverse_no
Enter Number To Reverse
12345
Reverse of Number: 54321

C:\Users\AT SYSTEMS\SkyDrive\Documents\forloop>  output:
     