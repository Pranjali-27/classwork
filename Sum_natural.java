import java.util.*;

class Sum_natural
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.print("Sum of natural number");
		
		System.out.print("Enter Last number upto perform  for sum : ");
			int i = sc.nextInt();
		

		for(int n=1; n<=i; n++)
		{
			sum=sum+n;

		}
				System.out.print("Your Sum is : " +sum);
	}
}
output:

C:\Users\AT SYSTEMS\SkyDrive\Documents\forloop>javac Sum_natural.java

C:\Users\AT SYSTEMS\SkyDrive\Documents\forloop>java Sum_natural
Sum of natural numberEnter Last number upto perform  for sum : 20
Your Sum is : 210
C:\Users\AT SYSTEMS\SkyDrive\Documents\forloop>