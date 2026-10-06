package madhu;

public class Father extends GrandFather {
	public void vehicle() {
		System.out.println("Honda");
	}
	public void business() {
		System.out.println("owner");
	}
	
	public static void main(String[]args) {
		Father obj = new Father();
		obj.business();
		obj.vehicle();
		
		
	}

}
