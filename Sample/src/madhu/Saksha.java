package madhu;

import java.util.LinkedHashSet;

public class Saksha {
	LinkedHashSet<String> obj = new LinkedHashSet();{
		obj.add("test");
		obj.add("test1");
		obj.add("test3");
		obj.add("test3");
		System.out.println(obj);
		System.out.println(obj.contains("test2"));
		System.out.println(obj.size());
		
	}

}
