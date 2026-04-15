package Java16;

public class PatternMatchingForInstanceOf {
	public static void main(String[] args) {
		
		Object obj = "Hello";
		
		if(obj instanceof String str) {
			System.out.println(str.length()); // 5
		}
	}
}
