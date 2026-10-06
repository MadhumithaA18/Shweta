package madhu;

import java.util.HashSet;

public class Masila {
	public static void main (String args[]) {
		HashSet<String> obj = new HashSet();
		obj.add("test");
		obj.add("test1");
		obj.add("test3");
		obj.add("test3");
		System.out.println(obj);
		System.out.println(obj);
		System.out.println(obj.size());
	}
}