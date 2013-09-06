/**
* Utility class to determine if sum is equal to 100.
*
* @author Emmanuel Nkuandu <nkuandu.emmanuel@hotmail.com>
*/
public class Sum {
	public static void main (String args[]){
		double sum = 0.0;
		for (int i = 0; i <= 1000; i++){
			sum += 0.1; 
		}
		System.out.print(sum + "\n");
		if (sum == 100){
			System.out.print("The sum is equal to 100");
		} else {
			System.out.print("The sum is not equal to 100");
		}
	}
}
