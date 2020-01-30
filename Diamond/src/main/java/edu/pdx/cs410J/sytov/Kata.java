package edu.pdx.cs410J.sytov;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Kata {
  public static final String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
  public static final char[] alphabet_arr = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

  private static String addSpaces(int n) {
    String str = "";
    for(int i = 0; i < n; ++i) {
      str += " ";
    }
    return str;
  }

  public static void printDiamond(char c) {
    int index = alphabet.indexOf(c);
    int outer_spaces = index;
    int inner_spaces = 1;
    System.out.println(addSpaces(outer_spaces) + "A");
    --outer_spaces;
    for(int i = 1; i <= index && outer_spaces >= 0; ++i) {
      System.out.println(addSpaces(outer_spaces) + alphabet_arr[i] + addSpaces(inner_spaces) + alphabet_arr[i]);
      --outer_spaces;
      inner_spaces += 2;
    }
    if(index > 0) {
      outer_spaces += 2;
      inner_spaces -= 4;
      for(int i = index - 1; i >= 1 && outer_spaces < index; --i) {
        System.out.println(addSpaces(outer_spaces) + alphabet_arr[i] + addSpaces(inner_spaces) + alphabet_arr[i]);
        ++outer_spaces;
        inner_spaces -= 2;
      }
      System.out.println(addSpaces(outer_spaces) + "A");
    }

  }

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

    args[0] = args[0].toUpperCase();
    if(!args[0].matches("[A-Z]+")) {
      System.err.println("You have to provide an alphabetical character as the input");
      System.exit(1);
    }
    char c = args[0].charAt(0);
    printDiamond(c);
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
