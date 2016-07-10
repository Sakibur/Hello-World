package sample.Games; // Guess the Number

//This program is a simple game called "Guess the Number"
/*
 * The objective of this game is to guess a number which the computer has already guessed,
 *  and use the clue given by the computer to  correctly guess the unknown.
 */

import java.util.Random;
import java.util.Scanner;

/*
 * one must import the java Scanner(Scanner readers the input); and Random(Random produces the random number)
 * in order to import, one can first declare the the Scanner and Random to a variable then fix the error.
 */
public class Game1 {

	// one can declare necessary variable by using the following ways
	public static int guess, number, max;
	public static Scanner scan;
	public static Random random;

	public static void main(String[] args) {

		/*
		 * IN ORDER TO ORGANIZE THE PROGRAM ONE CAN USE Ctrl + Shift + F keys TO
		 * ORGANIZE AUTOMATICALLY
		 */
		/*
		 * this following method can be use to command the variable 'scan' to
		 * use Scanner scan for any variables which was inputed in the system
		 * (System.in)
		 */ scan = new Scanner(System.in);

		/*
		 * this following method can be use to command the variable 'random' to
		 * use Random to produce a random integer.
		 */ random = new Random();

		/*
		 * this following method can be use to command the variable
		 * 'number'(which is going to hold the random number) to set the range
		 * in which the random number is going to be produced
		 * Variable.nextInt(integer) is a sat up for the range of the random
		 * number prediction. the range always starts at 0(0 is included) up to
		 * assigned Integer(assigned integer is not included)
		 */ number = random.nextInt(100);
		System.out.println();
		System.out.println("This game is called 'Guess The Number'");
		System.out.println();
		System.out.println(
				"-----------------------------------------------------------------------------------------------------------------------------------");
		System.out.println();
		System.out.println(
				"Objective: The oblective of the hame is to guess the number that the computer has in mind while taking as least steps as posible");

		System.out.println("The clues would be given. Please folow the instruntions. Good luck!! :)");
		System.out.println();
		System.out.println(
				"-----------------------------------------------------------------------------------------------------------------------------------");
		System.out.println();
		System.out.println("Please guess a number ");

		// this following while loop is used to loop the guesses until the
		// correct guess is found
		while (guess != number) {
			guess = scan.nextInt();
			if (guess > number) {
				System.out.println("The guess is too high. Guess again ");
			} else if (guess < number) {
				System.out.println("The guess is too low. Guess again");
			}

		}
		// to print the end statement always get out of while loop first
		System.out.println("The guess is correct");
		System.out.println("You Won");
	}

}
