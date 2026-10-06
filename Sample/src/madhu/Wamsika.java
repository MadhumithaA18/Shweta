package madhu;
import java.util.Scanner;

public class Wamsika {
	public static void main(String args[]) {
	Scanner obj = new Scanner(System.in);
	System.out.println("Enter first number");
	int a = obj.nextInt();

	System.out.println("Enter Second number");
	int b = obj.nextInt();

	System.out.println("Enter third number");
	int c = obj.nextInt();

	if(a > b && a > c) {
		System.out.println(a + " is largest");
	}else if(b > a && b > c) {
		System.out.println(b + " is largest");
	}else {
		System.out.println(c + " is largest");
	}
		
		}
	}


