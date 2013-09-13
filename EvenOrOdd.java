import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Utility class for determining whether a number is even or odd.
 * 
 * @author Emmanuel Nkuandu <nkuandu.emmanuel@hotmail.com>
 */

public class EvenOrOdd {
	public static void main(String args[]) throws IOException {
		System.out.print(" Type in a number! ");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String userInput = reader.readLine();
		int number = Integer.parseInt(userInput);
		if (number % 2 == 0) {
			System.out.print("Even");
		} else {
			System.out.print("Odd");
		}
	}
}
