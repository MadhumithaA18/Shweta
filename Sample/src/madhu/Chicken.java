package madhu;
import java.util.Arrays;

public class Chicken {	
		public static void main(String[] args) {
			
			int [] num = {10,25,15,80,78};
			int largest = num[0];
			for ( int i = 1; i < num.length;i++) {
				if(num[i] > largest) {
					largest = num[i];
				}
			}
			
			System.out.println("Largest : " + largest );
		}
	}


