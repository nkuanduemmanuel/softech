import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

/**
 * Utility class to display times since January 1970.
 *
 * @author Emmanuel Nkuandu <nkuandu.emmanuel@hotmail.com>
 */
public class GeekWatch {
  public static void main(String args[]) throws IOException {
    Date date = new Date();
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String userInput = reader.readLine();
    int dateUpToNow = Integer.parseInt(userInput);
    switch (dateUpToNow) {
      case 0:
        System.out.println(" number of milliseconds since January 1, 1970: " + date.getTime());
        break;
      case 1:
        System.out.println(" number of seconds since January 1, 1970: " + date.getTime() / 1000);
        break;
      case 2:
        System.out.println(" number of days since January 1, 1970: " + date.getTime() / 86400000);
        break;
      case 3:
        System.out.println(" Current date is " + date);
        break;
    }
  }
}
