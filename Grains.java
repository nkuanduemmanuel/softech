import java.math.*;
import java.io.IOException;
 
/**
 * Utility class to calculate the total number of grains.
 *
 * @author Emmanuel Nkuandu <nkuandu.emmanuel@hotmail.com>
 */

public class Grains {
	public static void main ( String arg[])	throws IOException{
	
		BigInteger totalNumberOfGrains = BigInteger.valueOf(0);
		BigInteger numberOfGrains = BigInteger.valueOf ( 1 );
		
		for (  int i = 1; i <= 64; i++ ) {					
			String output = " square " +  i + ":" + "\t" + NumberOfGrains + "\t" + "grains" + "\n" ;			
			System.out.print( output ); 
			totalNumberOfGrains = totalNumberOfGrains.add(numberOfGrains);	
			numberOfGrains = numberOfGrains.multiply( BigInteger.valueOf( 2 ) );
		}		
		System.out.print( "The total number of grains on the entire chess board is" + "\t" + totalNumberOfGrains );				
	}
}
