/*
 * Instance main() method: Java 25 allows us to write main method without public, static, String[] args.
 * 
 * Internal Work:
 * 
 * 1. First JVM will search for public static void main(String[] args), because it's standard entry point.
 * 2. If standard main() method is not present then it'll search for public static void main(), main() method with no parameter.
 * 3. If none of the main method is present, then it'll create instance for the class, and using that instance it'll call instance main() method.
 */

package Java25;

public class InstanceMainMethod {
	void main() {
		System.out.println("Instance Main Method"); // Instance Main Method
	}
}
