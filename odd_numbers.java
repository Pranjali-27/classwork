import java.util.*;
class odd_numbers
{
public static void main(String[]args)

{
 
  int count=0;
  Scanner sc = new Scanner(System.in);       
 System.out.println("odd no");

            for(int n=1;n<=100;n++)
              {
                 if(n%2!=0)
         {   
           System.out.println(n +"");
         count++;
         }

}
}
}
output:

C:\Users\AT SYSTEMS\SkyDrive\Documents\forloop>javac odd_numbers.java
odd_numbers.java:9: error: cannot find symbol
  Scanner sc =new Scanner(System.in);
  ^
  symbol:   class Scanner
  location: class odd_numbers
odd_numbers.java:9: error: cannot find symbol
  Scanner sc =new Scanner(System.in);
                  ^
  symbol:   class Scanner
  location: class odd_numbers
odd_numbers.java:12: error: cannot find symbol
            for(intn=1;n<=100;n++)
                ^
  symbol:   variable intn
  location: class odd_numbers
3 errors

C:\Users\AT SYSTEMS\SkyDrive\Documents\forloop>javac odd_numbers.java
odd_numbers.java:9: error: cannot find symbol
  Scanner sc = new Scanner(System.in);
  ^
  symbol:   class Scanner
  location: class odd_numbers
odd_numbers.java:9: error: cannot find symbol
  Scanner sc = new Scanner(System.in);
                   ^
  symbol:   class Scanner
  location: class odd_numbers
odd_numbers.java:12: error: variable n is already defined in method main(String[
])
            for(int n=1;n<=100;n++)
                    ^
3 errors

C:\Users\AT SYSTEMS\SkyDrive\Documents\forloop>javac odd_numbers.java
odd_numbers.java:8: error: cannot find symbol
  Scanner sc = new Scanner(System.in);
  ^
  symbol:   class Scanner
  location: class odd_numbers
odd_numbers.java:8: error: cannot find symbol
  Scanner sc = new Scanner(System.in);
                   ^
  symbol:   class Scanner
  location: class odd_numbers
2 errors

C:\Users\AT SYSTEMS\SkyDrive\Documents\forloop>javac odd_numbers.java

C:\Users\AT SYSTEMS\SkyDrive\Documents\forloop>java odd_numbers
odd no
1
3
5
7
9
11
13
15
17
19
21
23
25
27
29
31
33
35
37
39
41
43
45
47
49
51
53
55
57
59
61
63
65
67
69
71
73
75
77
79
81
83
85
87
89
91
93
95
97
99

C:\Users\AT SYSTEMS\SkyDrive\Documents\forloop>