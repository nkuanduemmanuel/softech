package com.javaranch.common;

import java.io.*;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.Iterator;

/**
 * Utility class for sorting a list of names readed from a text file using ArrayList.
 * 
 * @author Emmanuel Nkuandu <nkuandu.emmanuel@gmail.com>
 */

class Person implements Comparable {
                                     String firstName, lastName;

   public Person(String f, String l){
                                       this.firstName = f;
                                       this.lastName = l;
                                    }

  public String getFirstName(){
                                 return firstName;
                              }

  public String getLastName(){
                                return lastName;
                             }

  public String toString(){
                            return "[ firstname=" + firstName + ",lastname=" + lastName + "]";
                           }

  public int compareTo(Object obj){
                                    Person emp = (Person) obj;
                                    int deptComp = lastName.compareTo(emp.getLastName());
                                    return  deptComp;
                                   }

  public int compareToByFirst(Object obj){
                                           Person emp = (Person) obj;
                                           int deptComp = firstName.compareTo(emp.getFirstName());
                                           return  deptComp;
                                          }

  public boolean equals(Object obj){
        if (!(obj instanceof Person)){
                                       return false;
                                    }

    Person emp = (Person) obj;
    return firstName.equals(emp.getFirstName()) && lastName.equals(emp.getLastName());
  }
}

class PersonComparator implements Comparator<Person> {
      public int compare(Person emp1, Person emp2){
      int nameComp = emp1.getLastName().compareTo(emp2.getLastName());
      return  nameComp;
     }
   }

class PersonComparatorByFirst implements Comparator<Person> {
  public int compare(Person emp1, Person emp2) {
    int nameComp = emp1.getFirstName().compareTo(emp2.getFirstName());
    return  nameComp;
  }
}


public class SortNames {

  public static void main(String[] args) throws IOException {

    try{

         TextFileIn in = new TextFileIn("names.txt");       
         List<Person> PersonNames = new ArrayList<Person>();
         boolean done = false ;
         String[] words = {"Java","Programming"};
         int personCounter = 0 ;

    while(!done)
                {
                  String s = in.readLine();
     
                  if(s == null)
                      {
                        done = true ;
                      }
                   else
                 {    
                   words = s.split(" ");
                   PersonNames.add( new Person( words[0], words[1]));
                   words[0] = " ";
                   words[1] = " ";
                   System.out.println(personCounter + "-" + PersonNames.get(personCounter));
                   personCounter++;
                  }
                }
           in.close();

  System.out.println("Here is the  list of names sorted in order of first Name:\n" );

   Collections.sort(PersonNames,new PersonComparatorByFirst());
   for(Person pers: PersonNames){
                                  System.out.println(pers);
                                }

   System.out.println("Here is the  list of names sorted in order of first Name:\n" );

   Collections.sort(PersonNames,new PersonComparator());
   for(Person pers: PersonNames){
                                  System.out.println(pers);
                                } 
          } catch(FileNotFoundException e){
                      System.err.println("FileNotFoundException: " + e.getMessage());
          }         
  }  
  
}



