package madhu;

public class Ti {
	public static void main(String args[]) {
		System.out.println("hello");
	try {
		System.out.println(10/0);
	}catch(Exception e) {
		System.out.println("error occured");
		e.printStackTrace();
	}
System.out.println("bye");
	}

}
