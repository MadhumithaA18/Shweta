package madhu;

import java.util.Vector;

public class Sara {
public static void main (String args[]) {
	Vector<String> obj = new Vector();
	obj.add("test");
	obj.add("test1");
	obj.add("test3");
	obj.add("test3");
	System.out.println(obj);
	System.out.println(obj.get(1));
	System.out.println(obj.size());
}
}
