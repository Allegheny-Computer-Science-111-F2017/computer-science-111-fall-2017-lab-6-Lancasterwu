package labsix;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

/**
 * This class produces ManipulateDna program output.
 * The program will display some randomly changed strings.
 *
 * <p>Bugs: This program has no known bugs.
 *
 * @author Gregory Kapfhammer build the basic code and Lancaster Wu edited
 */

public class ManipulateDna {

  /**
 * This is part of lab 6 form Compsci 111.
 * students suppose to make a program called ManipulateDna, and
 * the output should be Randomly changed DNA strings.
 */
  public static void main(String[] args) {
    // display the name of the programmer and the date
    System.out.println("Lancaster Wu " + new Date());
    // declare the starting file and scanner
    File dnaInputsFile = null;
    Scanner scanner = null;
    // connect the scanner to the input file
    try {
      dnaInputsFile = new File("input/dna_inputs.txt");
      scanner = new Scanner(dnaInputsFile);
    } catch (FileNotFoundException noFile) {
      System.out.println("Unable to locate file");
    }
    // Step One: Read in and display the chosen DNA string
    String dna =  scanner.nextLine();
    System.out.println("Okay, I am going to manipulate the DNA string: \"" + dna + "\".");
    System.out.println();
    // Step Two: Compute the complement of the DNA String
    System.out.println("Enter a string containing only C, G, T, and A: " + dna);
    String complement1 = dna.replace("a","T");
    String complement2 = complement1.replace("c","G");
    String complement3 = complement2.replace("t","A");
    String complement4 = complement3.replace("g","C");
    String dna2 = dna.toUpperCase();
    System.out.println("Complement of " + dna2 + " is " + complement4);
    // Step Three: Insert a randomly chosen DNA letter into the DNA String
    Random generator = new Random();
    int num1;
    num1 = generator.nextInt(dna2.length());
    int num2;
    num2 = generator.nextInt(dna2.length());
    char char1;
    char1 = dna2.charAt(num2);
    String insert = dna2.substring(0,num1) + char1 + dna2.substring(num1,dna2.length());
    System.out.println("Inserting " + char1 + " at position " + num1 + " gives " + insert);
    // Step Four: Delete a DNA letter from a randomly chosen position in the DNA string
    int num3;
    num3 = generator.nextInt(dna2.length());
    String delete = dna2.substring(0,num3) + dna2.substring(num3 + 1,dna2.length());
    System.out.println("Deleting from position " + num3 + " gives " + delete);
    // Step Five: Change a random position in the DNA String to a randomly chosen DNA letter
    int num4;
    int num5;
    num4 = generator.nextInt(dna2.length());
    num5 = generator.nextInt(dna2.length());
    char char2;
    char2 = dna2.charAt(num4);
    char char3;
    char3 = dna2.charAt(num5);
    String replace = dna2.replace(char2,char3);
    System.out.println("Changing position " + num4 + " gives " + replace);
    // Step Six: Display a final thankyou message
    System.out.println();
    System.out.println("Thanks for using the ManipulateDna program.");
    System.out.println("Have an awesome day.");
  }

}
