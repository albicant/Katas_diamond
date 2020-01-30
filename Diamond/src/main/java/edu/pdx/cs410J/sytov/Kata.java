package edu.pdx.cs410J.sytov;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Kata {
                                                                                    

  public static void main(String[] args) {
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

    char c = args[0].charAt(0);
    System.exit(0);
  }
}