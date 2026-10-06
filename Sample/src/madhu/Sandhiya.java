package madhu;

import java.util.ArrayList;

public class Sandhiya {
	public static void main (String[] args) {
		ArrayList obj = new ArrayList();
		obj.add(20);
		obj.add('c');
		obj.add("test");
		obj.add(true);
		obj.set(1, "test1");
		obj.remove(0);
		System.out.println(obj);
		System.out.println(obj.get(1));
		System.out.println(obj.size());
	}

}
