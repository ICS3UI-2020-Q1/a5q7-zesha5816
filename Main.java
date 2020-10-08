import java.util.Scanner;
/**
 * modify the program to create an empty box of stars
 * @author Ahmad Zeshan
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Create the Scanner
		Scanner input = new Scanner(System.in);
		// get the users numbe
    int userNumber = 0;
      System.out.println("Please enter a number between 1 and 10");
      userNumber = input.nextInt();
    // for loop that stops when it reaches 1 less than the users number inside of a for loop that stops when it reaches just below the users number

    for (int i = 0; i < userNumber; i++) {
      // checks if the number is the beginning of the lines or the end
      if (i == userNumber - 1 || i == 0) {
        for (int j = 0; j < userNumber; j++) {
          // output a star
          System.out.print("*");
        }
      } else {
        for (int j = 0; j < userNumber; j++) {
          // checks if it's the beginning of the line or at the end, if it isn't either it prints a space
          if (j == userNumber - 1 || j == 0) {
            // output stars on the line 
            System.out.print("*");
          } else {
            System.out.print(" ");
          }
        } 
      }
      // spaces so it goes to next line
      System.out.println();
    }
  }
}
