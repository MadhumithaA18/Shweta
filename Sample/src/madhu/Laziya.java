package madhu;

import java.util.LinkedHashMap;

public class Laziya {
	public static void main(String args[]) {
		LinkedHashMap <String, String> obj = new LinkedHashMap<String,String>();
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

