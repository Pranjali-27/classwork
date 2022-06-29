
import java.util.*;
class Vowel_not
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter any character : ");
			char ch = sc.next().charAt(0);
		
		for(int n = 1; n>0; n--)
		{
			if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U')
				System.out.println("Entered character is vowel");

			else
				System.out.println("Entered character is not vowel");

		}
	}
}
output:

C:\Users\AT SYSTEMS\SkyDrive\Documents\forloop>javac Vowel_not.java

C:\Users\AT SYSTEMS\SkyDrive\Documents\forloop>java Vowel_not
Enter any character : U
Entered character is vowel

C:\Users\AT SYSTEMS\SkyDrive\Documents\forloop>