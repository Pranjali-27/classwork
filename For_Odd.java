import java.util.*;
class For_Odd
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
    			if(rem%2==1)
    			System.out.println("+rem+");
      	}

     }
}
output:

C:\Users\AT SYSTEMS\SkyDrive\Documents\forloop>javac For_Odd.java

C:\Users\AT SYSTEMS\SkyDrive\Documents\forloop>java For_Odd
Enter a Number : 17
+rem+
+rem+

C:\Users\AT SYSTEMS\SkyDrive\Documents\forloop>