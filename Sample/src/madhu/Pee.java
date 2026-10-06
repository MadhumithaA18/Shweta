package madhu;

import java.util.LinkedList;

public class Pee {
	public static void main(String args[]) {
		LinkedList<String> obj = new LinkedList();
		obj.add("test");
		obj.add("test");
		obj.add("test1");
		obj.add("test2");
		obj.add("test3");
		obj.addFirst("black");
		obj.addLast("white");
		obj.removeFirst();
		obj.removeLast();
		System.out.println(obj);
		System.out.println(obj.get(1));
		System.out.println(obj.getFirst());
		System.out.println(obj.getLast());
		System.out.println(obj.size());
		
		
		
	}

}
