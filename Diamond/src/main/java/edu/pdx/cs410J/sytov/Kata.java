package edu.pdx.cs410J.sytov;


import java.util.HashSet;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Kata {
                                                                                    

  public static void main(String[] args) {
    char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

    if (args.length < 1) {
      System.err.println("Missing command line arguments");
      System.exit(1);
    }
    else if (args.length > 1) {
      System.err.println("To many command line arguments");
      System.exit(1);
    }

    if(args[0].length() != 1) {
      System.err.println("The String has to contain only 1 character");
      System.exit(1);
    }

    args[0] = args[0].toUpperCase();
    if(!args[0].matches("[A-Z]+")) {
      System.err.println("You have to provide an alphabetical character as the input");
      System.exit(1);
    }
    char c = args[0].charAt(0);
    System.exit(0);
  }


}



    /* Visual reference
    String space = " ";
    System.out.println(space + space + space +  "A");
    System.out.println(space + space + "B" + space + "B");
    System.out.println(space + "C" + space + space + space + "C");
    System.out.println("D" + space + space + space + space + space + "D");
    System.out.println(space + "C" + space + space + space + "C");
    System.out.println(space + space + "B" + space + "B");
    System.out.println(space + space + space +  "A");
   */
