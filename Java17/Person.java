/*
 * Record Class: Record class in Java is a special type of class that designed to store immutable data.
 * 
 * It will provide:
 * 
 * 1. private final variables.
 * 2. A constructor
 * 3. getter() methods
 * 4. Overridden equals(), hashcode() and toString() methods.
 */

package Java17;

public record Person(String name, int age) {

}
