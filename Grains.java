import java.math.*;
import java.io.IOException;
 
/**
 * Utility class to calculate the total number of grains.
 *
 * @author Emmanuel Nkuandu <nkuandu.emmanuel@hotmail.com>
 */

public class Grains {
	public static void main ( String arg[])	throws IOException{
	
		BigInteger TotalNumberOfGrains = BigInteger.valueOf(0);
		BigInteger NumberOfGrains = BigInteger.valueOf ( 1 );
		
		
		for (  int i = 1; i <= 64; i++ ) {					
			String output = " square " +  i + ":" + "\t" + NumberOfGrains + "\t" + "grains" + "\n" ;			
			System.out.print( output ); 
			TotalNumberOfGrains = TotalNumberOfGrains.add(NumberOfGrains);	
			NumberOfGrains = NumberOfGrains.multiply( BigInteger.valueOf( 2 ) );
		}		
		System.out.print( "The total number of grains on the entire chess board is" + "\t" + TotalNumberOfGrains );				
	}
}