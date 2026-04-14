package Java14;

public class SwitchExpression {
	public static void main(String[] args) {
		
		int day = 3;
		
		String dayType = switch(day) {
			case 1,7 -> "Weekend";
			case 2,3,4,5,6 -> "Weekday";
			default -> "Invalid Day";
		};
		
		System.out.println(dayType); // Weekday
	}
}
