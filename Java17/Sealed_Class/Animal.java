/*
 * Sealed Class: Sealed Class in Java is a class that restricts only specific classes to extend it.
 * 
 * Syntax: 
 *       
 *       sealed class Class_Name permits class1, class2{ }
 *       
 *       sealed - restricted inheritance
 *       permits - lists allowed sub-classes
 * 
 * Rules:
 * 
 * Any class that extends sealed class must be any of these -
 * 
 * 1. Final - can't be inherited further
 * 2. sealed - continues restriction
 * 3. non-sealed - removes restriction
 */

package Java17.Sealed_Class;

sealed public class Animal permits Dog,Cat{
	void makeSound() {
		System.out.println("Animal Makes Sound");
	}
}
