import java.util.*;

class HCF
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int hf = 0;

		System.out.print("Enter first number : ");
			int a = sc.nextInt();
		System.out.print("Enter second number : ");
			int b = sc.nextInt();
		
		

		for(int i = 1; i<=a || i<=b; i++)
		{
			if(a%i==0)
			{
				if(b%i==0)
					 hf = i;
			}	
			
		}
			System.out.println("HCF of two number is : "+hf);

	}
}