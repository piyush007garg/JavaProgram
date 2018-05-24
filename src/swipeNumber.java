import java.util.Scanner;

/* swipe the number without using third variable
 * 
 */

public class swipeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b;
		System.out.println("Enter a and b");
		Scanner in = new Scanner(System.in);

		a = in.nextInt();
		b = in.nextInt();

		System.out.println("Before Swapping\nx = " + a + "\ny = " + b);

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("After swap:");
		System.out.println("x value: " + a);
		System.out.println("y value: " + b);
		System.out.println("Happy Ending");
	}

}
