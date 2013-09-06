/**
 * Utility class to print out a times table.
 *
 * @author Emmanuel Nkuandu <nkuandu.emmanuel@hotmail.com>
 */
public class Times {
	
    public static void main (String args[]){
        System.out.print("\t");
	for(int i = 0; i <= 9; i++){		   
	    System.out.print(i + "\t");
	}
	System.out.print("\n");
	for (int j = 0; j <= 9; j++) {   
             System.out.print(j + "\t");
             for (int k = 0; k <= 9; k++){
	          System.out.print(j*k + "\t");			  
             }
	     System.out.print("\n");
	}
    }
}
