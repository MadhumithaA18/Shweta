package madhu;
import java.util.HashMap;

public class Muni {
public static void main(String args[]) {
	HashMap<Integer,String>obj = new HashMap<Integer,String>();
	obj.put(1, "subi");
	obj.put(2, "sruthi");
	obj.put(3, "madhu");
	obj.put(4, "madhu");
	obj.replace(4, "madhu","luckie");
	System.out.println(obj);
}
}