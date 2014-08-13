import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.io.BufferedReader;

/**
 * Utility class to multiply two numbers in letters using HashMap.
 * 
 * @author Emmanuel Nkuandu <nkuandu.emmanuel@gmail.com>
 */

public class NaturalLanguageMultiply{

      public static void main(String[] args) throws IOException {
      	HashMap<String, Integer> map = new HashMap<String, Integer>();
      	map.put("zero", 0 );
      	map.put("one", 1 );
      	map.put("two", 2 );
      	map.put("three", 3 );
      	map.put("four", 4 );
      	map.put("five", 5 );
      	map.put("six", 6 );
      	map.put("seven", 7 );
      	map.put("eight", 8 );
      	map.put("nine", 9 );
      	map.put("ten", 10 );
      	map.put("eleven", 11 );
      	map.put("twelve", 12 );
      	map.put("thirteen", 13 );
      	map.put("fourteen", 14 );
      	map.put("fithteen", 15 );
      	map.put("sixtheen", 16 );
      	map.put("seventheen", 17 );
      	map.put("eitheen", 18 );
      	map.put("ninetheen", 19 );
      	map.put("twenty", 20 );
      	map.put("thirty",30 );
      	map.put("fourty", 40 );
      	map.put("fithty",50 );
      	map.put("sixty",60 );
      	map.put("seventy", 70 );
      	map.put("eighty", 80 );
      	map.put("ninety", 90 );
      	     
      	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

      	System.out.println("Type in lower case letter the first number between 0 and 99");
      	String firstInputNumber = reader.readLine();
            
            if (firstInputNumber.length() == 0 )
                  System.out.println("number can not be empty, please type in a number");
      
            firstInputNumber = reader.readLine();
            
            System.out.println("Type in lower case letter the second number between 0 and 99");
            String secondInputNumber = reader.readLine(); 
            
             if (secondInputNumber.length() == 0)
                  System.out.println("number can not be empty, please type in a number");                                         
                  secondInputNumber = reader.readLine();           

      	    String[] words1 = firstInputNumber.split("\\s+");
            String[] words2 = secondInputNumber.split("\\s+");
               if((words1.length > 2) || (words2.length > 2)){
                    System.out.println("The numbers you introduced are greater than 99,type in the first number");
                    firstInputNumber = reader.readLine();
                    System.out.println("type in second number");
                    secondInputNumber = reader.readLine(); 
                   }
                                                                       
              else if(( words1.length == 2) && (words2.length == 2)){
                     if(!map.containsKey(words1[0]) || !map.containsKey(words1[1]) || !map.containsKey(words2[0]) || !map.containsKey(words2[1])){
                     System.out.println("Please type in lower case letter 2 integers between 0 and 99");
                     firstInputNumber = reader.readLine();
                     secondInputNumber = reader.readLine();                     
                     };
                     words1 = firstInputNumber.split("\\s+");
                     words2 = secondInputNumber.split("\\s+");    
                     int n1 =  map.get(words1[0])+ map.get(words1[1]);
                     int n2 =  map.get(words2[0])+ map.get(words2[1]);               
                    System.out.println("The product of the 2 numbers is" + "\t" + n1 * n2 );
                  }
                    else                     
                        if((words1.length == 2) && (words2.length == 1)){
                             if(!map.containsKey(words1[0]) || !map.containsKey(words1[1])){
                                   System.out.println("retype the first integer between 0 and 99");
                                   firstInputNumber = reader.readLine();
                             }
                             words1 = firstInputNumber.split("\\s+");
                             int n1 = map.get(words1[0])+ map.get(words1[1]);
                             int n2 = map.get(secondInputNumber);
                             System.out.println("The product of the 2 numbers is" + "\t" + n1 * n2);
                       }

                       else 
                             if ((words1.length == 1) && (words2.length == 2) ){
                             if(!map.containsKey(words2[0]) || !map.containsKey(words2[1])){
                                   System.out.println("retype the second integer between 0 and 99");
                                   secondInputNumber = reader.readLine();
                             }
                             words2 = secondInputNumber.split("\\s+");
                             int n1 = map.get(firstInputNumber);
                             int n2 = map.get(words2[0])+ map.get(words2[1]);
                             System.out.println("The product of the 2 numbers is" + "\t" + n1 * n2);
                       }

                       else{
                             int n1 = map.get(firstInputNumber);
                             int n2 =  map.get(secondInputNumber);
                             System.out.println("The product of the 2 numbers is" + "\t" + n1 * n2 );
                       }             
          }
}
