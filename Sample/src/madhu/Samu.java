package madhu;

public class Samu {
	String name;
	int age;
	
	Samu(String n , int a){
	name = n;
	age = a;
	}
	Samu(Samu s){
		name = s.name;
		age = s.age;
	}
   public static void main(String args[]) {
   
   Samu s = new Samu("madhu",25);
   System.out.println(s.name);
   Samu s2 = new Samu(s);
   System.out.println(s2.name);
   System.out.println(s2.age);
   
   }
}
