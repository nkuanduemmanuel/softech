import java.io.*;

/**
 * Utility class to print user input 100 times.
 *
 * @author Emmanuel Nkuandu <nkuandu.emmanuel@hotmail.com>
 */

public class Hundred {
	public static void main (String[] args) throws IOException {
	  System.out.println("Type some text and press 'Enter.'");		 
	  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 

	  String UserInput = reader.readLine();		 
          for(int i= 1; i <= 100; i++) {
       	  System.out.print( UserInput + "\t" );
       }
    }
 }
