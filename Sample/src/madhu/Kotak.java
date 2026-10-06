package madhu;

public class Kotak implements Mahindra {
	public void savings() {
		System.out.println(360);
	}
	public void salary() {
		System.out.println(1000);
	}
	public static void main(String args[]) {
		Bank obj = new Bank();
		obj.savings();
		obj.salary();
	}

}
