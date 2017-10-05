package labsix;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Scanner;

public class ManipulateDna {

  public static void main(String[] args) {
    // display the name of the programmer and the date
    System.out.println("Gregory M. Kapfhammer " + new Date());
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
    System.out.println("Lancaster Wu " + new Date());
    System.out.println("Okay, I am going to manipulate the DNA string: \"" + dna + "\".");
    System.out.println();
    // Step Two: Compute the complement of the DNA String
    System.out.println("Enter a string containing only C, G, T, and A: " + dna);
    String complement1 = dna.replace("a","T");
    String complement2 = complement1.replace("c","G");
    String complement3 = complement2.replace("t","A");
    String complement4 = complement3.replace("g","C");
    System.out.println("Complement of " + dna.toUpperCase() + " is " + complement4);
    // Step Three: Insert a randomly chosen DNA letter into the DNA String
    Random generator = new Random();
    // Step Four: Delete a DNA letter from a randomly chosen position in the DNA string

    // Step Five: Change a random position in the DNA String to a randomly chosen DNA letter

    // Step Six: Display a final thankyou message

  }

}
