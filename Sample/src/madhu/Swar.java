package madhu;

public class Swar {
	public static void main(String args[]) {
		StringBuffer obj = new StringBuffer("Hello");
		obj.append("world");
		System.out.println(obj);
		
		
		StringBuffer obj1 = new StringBuffer("Hlo ");
		obj1.insert(1, "el");
		System.out.println(obj1);
		
		StringBuffer obj2 = new StringBuffer("Heeello");
		obj2.delete(1,3);
		System.out.println(obj2);
		
		StringBuffer obj3 = new StringBuffer("olleh");
		obj3.reverse( );
		System.out.println(obj3);
		
	
		
		
		}

}
