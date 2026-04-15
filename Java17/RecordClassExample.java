package Java17;

public class RecordClassExample {
	public static void main(String[] args) {
		
		Person p = new Person("Abhishek", 24);
		
		System.out.println(p.name()); // Abhishek
		System.out.println(p.age()); // 24
		
		System.out.println(p); // Person[name=Abhishek, age=24]
	}
}
