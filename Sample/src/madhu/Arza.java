package madhu;
import java.util.HashMap;

public class Arza {
	public static void main(String args[]) {
		HashMap <String, String> obj = new HashMap<String,String>();
			obj.put("india", "delhi");
			obj.put("japan", "tokyo");
			obj.put("Uk", "london");
			obj.put("england", "london");
			obj.replace("england", "london", "londonuk");
			obj.remove("Uk");
			System.out.println(obj);
			System.out.println(obj.get("japan"));
			
			
			
		}
	}


