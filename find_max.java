import java.util.*;
class find_max
{
public static void main(String[]args)
{
  Scanner sc=new Scanner(System.in);
   System.out.print("Enter no:");
  int n=sc.nextInt();  
  int k=0;
  int rem;
        do
         {
          System.out.println("maximum no is :"+k);
            rem = n%10;
            if(rem>k)
             { 
          k=rem;
         n=n/10;
             }while(n!=0);
  
}
}
}