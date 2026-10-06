package madhu;
import java.util.Scanner;

public class Eksha {
	public static void main(String[] args) {

		 Scanner sc = new Scanner(System.in);
		 System.out.println("enter the first number");
		 int num1 = sc.nextInt();
		 
		 System.out.println("enter the second number");
		 int num2 = sc.nextInt();
		 
		 System.out.println("choose the operator (+ , - , * , /)");
		 char op = sc.next().charAt(0);
		 
		 switch(op) {
		 case '+':
			 System.out.println("Result : " + (num1 + num2 ));
			 break;
		 case '-':
			 System.out.println("Result : " + (num1 - num2 ));
			 break; 
		 case '*':
			 System.out.println("Result : " + (num1 * num2 ));
			 break;
		 case '/':
			 System.out.println("Result : " + (num1 / num2 ));
			 break;
		 case '%':
			 System.out.println("Result : " + (num1 % num2 ));
			 break;
		default :
			System.out.println("error");
		 
			 
		 }
			 
	}
}

