import java.util.*;

class Simple_Interest
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		
		System.out.print("Enter Principle Amount : ");
			double p = sc.nextDouble();
		System.out.print("tEnter Rate of Interest : ");
			double r = sc.nextDouble();
			double t = 10.0d;
		

		for(int i = 1; i<=10; i++)
		{
			if(i==1)
			{
				System.out.println("Year 1 :");
				double SI = (p*r*1)/100;
				System.out.println("Principle Amount is = " +p);
				System.out.println("Rate of Interest is = " +r);
				System.out.println("Time Duration is = " +t);
				System.out.println("Interest Amount is = " +SI);
				double pa = p+SI;
				System.out.println("Total payable amount = " +pa);
				
			}

			else if(i==2)
			{
				System.out.println("Year 2 :");
				double SI = (p*r*2)/100;
				System.out.println("Principle Amount is = " +p);
				System.out.println("Rate of Interest is = " +r);
				System.out.println("tTime Duration is = " +t);
				System.out.println("tInterest Amount is = " +SI);
				double pa = p+SI;
				System.out.println("Total payable amount = " +pa);
				
			}	
	
			else if(i==3 )
			{
				System.out.println("Year 3 :");
				double SI = (p*r*3)/100;
				System.out.println("Principle Amount is = " +p);
				System.out.println("Rate of Interest is = " +r);
				System.out.println("Time Duration is = " +t);
				System.out.println("Interest Amount is = " +SI);
				double pa = p+SI;
				System.out.println("Total payable amount = " +pa);
				
			}

			else if(i==4 )
			{
				System.out.println("Year 4 :");
				double SI = (p*r*4)/100;
				System.out.println("Principle Amount is = " +p);
				System.out.println("Rate of Interest is = " +r);
				System.out.println("Time Duration is = " +t);
				System.out.println("Interest Amount is = " +SI);
				double pa = p+SI;
				System.out.println("Total payable amount = " +pa);
				
			}

			else if(i==5 )
			{
				System.out.println("Year 5 :");
				double SI = (p*r*5)/100;
				System.out.println("Principle Amount is = " +p);
				System.out.println("Rate of Interest is = " +r);
				System.out.println("Time Duration is = " +t);
				System.out.println("Interest Amount is = " +SI);
				double pa = p+SI;
				System.out.println("Total payable amount = " +pa);
				
			}

			else if(i==6)
			{
				System.out.println("Year 6 :");
				double SI = (p*r*6)/100;
				System.out.println("Principle Amount is = " +p);
				System.out.println("Rate of Interest is = " +r);
				System.out.println("Time Duration is = " +t);
				System.out.println("Interest Amount is = " +SI);
				double pa = p+SI;
				System.out.println("Total payable amount = " +pa);
				
				
			}

			else if(i==7)
			{
				System.out.println("Year 7 :");
				double SI = (p*r*7)/100;
				System.out.println("Principle Amount is = " +p);
				System.out.println("Rate of Interest is = " +r);
				System.out.println("Time Duration is = " +t);
				System.out.println("Interest Amount is = " +SI);
				double pa = p+SI;
				System.out.println("Total payable amount = " +pa);
				
			}	
	
			else if(i==8)
			{
				System.out.println("Year 8 :");
				double SI = (p*r*3)/100;
				System.out.println("Principle Amount is = " +p);
				System.out.println("Rate of Interest is = " +r);
				System.out.println("Time Duration is = " +t);
				System.out.println("Interest Amount is = " +SI);
				double pa = p+SI;
				System.out.println("Total payable amount = " +pa);
				
			}

			else if(i==9)
			{
				System.out.println("Year 9 :");
				double SI = (p*r*8)/100;
				System.out.println("Principle Amount is = " +p);
				System.out.println("Rate of Interest is = " +r);
				System.out.println("Time Duration is = " +t);
				System.out.println("Interest Amount is = " +SI);
				double pa = p+SI;
				System.out.println("Total payable amount = " +pa);
				
			}

			else if(i==10)
			{
				System.out.println("Year 10 :");
				double SI = (p*r*10)/100;
				System.out.println("Principle Amount is = " +p);
				System.out.println("Rate of Interest is = " +r);
				System.out.println("Time Duration is = " +t);
				System.out.println("Interest Amount is = " +SI);
				double pa = p+SI;
				System.out.println("Total payable amount = " +pa);
				
			}

		}
	}
}