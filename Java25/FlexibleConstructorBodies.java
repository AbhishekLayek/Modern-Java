package Java25;

public class FlexibleConstructorBodies {
	
	public FlexibleConstructorBodies(String str) {
		System.out.println(str);
		System.out.println("In Java25, We Can Write Statements Before this() and super() calling statement");
	}
	
	FlexibleConstructorBodies(){
		System.out.println("Welcome To Java25");
		this("Java25 Allows Flexible Constructor Bodies");
	}
	
	public static void main(String[] args) {
		new FlexibleConstructorBodies();
	}
}

/*
 * Output:
 * 
 * Welcome To Java25
 * Java25 Allows Flexible Constructor Bodies
 * In Java25, We Can Write Statements Before this() and super() calling statement
 */