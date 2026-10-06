package madhu;

public class Same {
	public static void main(String args[]) {
   int num = 153;
   int temp =  num;
   int sum = 0;
   
   while(num > 0) {
	   int d = num% 10;
	   sum = sum+(d*d*d);
	   num = num/10;
   }
   if(sum==temp) {
	   
	   	System.out.println("It is a armsrtong");
   }
	   	
	   	else {
	   		System.out.println("not a armstsrong");
	   	}
   }
	

}

