package madhu;

public class Dog {
	public void animal() {
		System.out.println("meow");
	}
	public static void main(String args[]){
		Dog obj = new Dog();
		obj.animal();
		
		Cat obj1 = new Cat();
		obj1.animal();
		
	}
}
