import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Utility class to determine if a year is a leap year.
 *
 * @author Emmanuel Nkuandu <nkuandu.emmanuel@hotmail.com>
 */

public class LeapYear{
	
    public static void main(String args[]) throws IOException {
        System.out.print("Type in a year!");		
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	String userInput = reader.readLine();
	int number = Integer.parseInt(userInput);
	boolean isDivisibleByFour = ((number % 4) == 0);
	boolean isDivisibleByHundred = ((number % 100) == 0);
	boolean isDivisibleByFourHundred = ((number % 400) == 0);
	if (isDivisibleByFour && !isDivisibleByHundred && !isDivisibleByFourHundred){
	    System.out.print(("Leap Year!")); 
	} else { 
	    System.out.print("Not a Leap Year!");
	}  
    }
}
