import java.util.*;
class For25Even_no
{
     public static void main(String[]args)
     {
		Scanner sc=new Scanner(System.in);
     		
		System.out.print("Enter a Number : ");
			int n=sc.nextInt();

		int rem;
		
   	      for(int i=n; i!=0; i=i/10)
  		{
    			rem=i%10;
    			if(rem%2==0)
    			System.out.println("+rem+");
      	}

     }
}
output:



C:\Users\AT SYSTEMS\SkyDrive\Documents\forloop>javac For25Even_no.java

C:\Users\AT SYSTEMS\SkyDrive\Documents\forloop>java For25Even_no.java
Enter a Number : 40
+rem+
+rem+

C:\Users\AT SYSTEMS\SkyDrive\Documents\forloop>