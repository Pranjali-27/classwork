class Evenodd_no
{

public static void main(String[] args)
{

        int number=201;
        int Sum=0;
        int count=0;
        int s1=0;
        int count1=0;
             
           do
          
          {
            System.out.println("Total EvenNumber= "+Sum);
               
               System.out.println("Total OddNumber= "+s1); 


           if(number%2==0)
             {
            Sum=number + Sum;
            count++;
              } 
          else
             {
             s1=number+s1;
              count1++;
             }

               number++;
             }while(number<=400);
               
               
                  int difference=Sum-s1;
               System.out.println("difference= "+difference);
               System.out.println("TotalEvennumber = "+count);
               System.out.println("Total oddnumber = "+count1);
}
}

output:

Total OddNumber= 6129
Total EvenNumber= 6156

difference= 100
TotalEvennumber = 100
Total oddnumber = 100

C:\Users\AT SYSTEMS\SkyDrive\Documents\dowhile>


