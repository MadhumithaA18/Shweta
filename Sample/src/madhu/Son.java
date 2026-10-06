package madhu;

public class Son extends Father {
	public void education() {
		System.out.println("School");
	}

	
	public static void main (String [] args) {
		Son obj = new Son();
		obj.business();
		obj.vehicle();
		obj.education();
		obj.land();
	}
	

}
