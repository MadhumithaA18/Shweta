package madhu;
import java.util.ArrayList;

public class Emma {
	public static void main(String args[]) {
		ArrayList<String> obj = new ArrayList<String>();
		obj.add("red");
		obj.add("green");
		obj.add("maruthani");
		obj.add("rakshi");
		obj.set(2,"purple");
		obj.remove(3);
		System.out.println(obj);
		System.out.println(obj.get(0));
	}

}
