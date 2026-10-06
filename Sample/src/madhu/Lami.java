package madhu;
import java.util.Scanner;
public class Lami {
	public static void main(String args[]) {
		Scanner obj = new Scanner (System.in);
		System.out.println("enter number");
		int n = obj.nextInt();
		int count= 0;
		for (int i = 1; i<=n; i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count ==2) {
			System.out.println("its a prime number");
		}else {
			System.out.println("its not a prime number");
		}
	}
	}
