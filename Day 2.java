RELATIONAL OPERATOR
class relational
 {
 	public static void main(String[] args)
 	 {
 	 	int a = 110, b = 109;
 	 	System.out.println("Equal to :" + (a == b));          System.out.println("Not equal :" + (a != b));       System.out.println("Greater than :" + (a > b));          System.out.println("Less than :" + (a < b));            System.out.println("Greater than or equal :" + (a >= b));
 	 	System.out.println("Less than or equal :" + (a <= b));
 	 	
 	 	}
 }
 
 LOGICAL OPERATOR
 class Logical
  {
  	public static void main(String[] args) 
  	{
  		int m1 = 25, m2 = 75;
  		System.out.println("AND && :" + (m1 >= 35 && m2 >= 35));
  		System.out.println("OR || :" + (m1 >= 35 || m2 >= 35));
  		System.out.println("NOT ! :" + (!(m1 > m2)));
  		}
  }
  
  
  CONDITIONAL OPERATOR
  
  class conditional
   {
   	public static void main(String args[]) 
   	{
   		int a = 45, b = 35, c;
   		c = a > b ? a : b;
   		System.out.println("The Greatest Number is :" + c);
   		}
   }
   
   BITWISE &SHIFT OPERATOR
   class Bitwise
    {
    	public static void main(String[] args) {
    		int a = 10, b = 2;System.out.println("Bitwise AND & :" + (a & b))
    		;System.out.println("Bitwise OR | :" + (a | b));
    		System.out.println("Bitwise XOR ^ :" + (a ^ b));
    		System.out.println("Complement ~ :" + (~a));
    		System.out.println("Right shift >> :" + (a >> b));
    		System.out.println("Left shift << :" + (a << b));
    		}
    	}
    	
    	



import java.util.Scanner;
public class UserInputExample 
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);String Name;
		int Age;
		System.out.print("Enter your name :");Name = in.nextLine();
		System.out.print("Enter your age :");
		Age = in.nextInt();
		System.out.println("Hello, " + Name + "! You are " + Age + " years old.");
		}
}



IF STATEMENT

import java.util.Scanner;
class if_statement
 {
 	public static void main(String[] args)
 	 {
 	 	int age;
 	 	System.out.println("Enter your age :");Scanner in = new Scanner(System.in);age = in.nextInt();
 	 	if(age >= 18)
 	 	 {
 	 	 	System.out.println("You are eligible for Vote");
 	 	 	}
 	 	}
 }
 
 
 NESTED IF STATEMENT
 public class NestedIf 
 {
 	public static void main(String[] args)
 	 {
 	 	int x = 30;
 	 	int y = 10;
 	 	if (x > y) {
 	 		System.out.println("x is greater than y");
 	 		if (x > 20) {
 	 			System.out.println("x is also greater than 20");
 	 			}
 	 			 else {
 	 			 	System.out.println("x is not greater than 20");
 	 			 	}
 	 			 } 
 	 			 else if (x < y) {System.out.println("x is less than y");
 	 			 } 
 	 			 else {System.out.println("x is equal to y");
 	 			 }
 	 		}
 	 		
 	}
