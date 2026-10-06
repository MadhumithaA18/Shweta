package madhu;

public class Student {
	public void name(String name) {
		System.out.println(name);
	}
	public void name(int age) {
		System.out.println(age);
	}
	public void name(boolean isactive) {
		System.out.println(isactive);
		
	}
	public static void main(String args[]) {
		Student obj=new Student();
		obj.name("Madhu");
		obj.name(21);
		obj.name(false);		
	}
	}
