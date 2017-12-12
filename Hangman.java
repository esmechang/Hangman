package hangman;

import java.util.*;
import java.io.*;


public class Hangman {
	
	
	
	//chances. Game over at 8th try.
	public static final int Lives = 8;
	
	//splits text file and stores the words into the array
	private static String[] list = {"able","about","account","acid","across","act",
			"addition","adjustment","advertisement","after","again","against",
			"agreement","air","all"};
	
	//gets random index of an array and gets the word at that index
	private static String word = list[(int) (Math.random()*list.length)];//sets the word
	
	//player's progress through the game
	private static String progress = start(word);

	private static int tries = 0;
	
	//this function uses recursion to print out blank spaces for the word
	//so the player knows how many characters are there.
	public static String start(String word) {
		if(word.length()==0) {
			return "";
		}
		return "-" + start(word.substring(1, word.length()));
	}
	
	//main method
	public static void main(String args[]) {
		
		Scanner stringScan = new Scanner(System.in);
	
	//as long as we have tries left and the player didn't guess the word yet
	while(tries < Lives && progress.contains("-")) {
		System.out.println("Guess the letter.");
		//prints where we are at
		System.out.println(progress);
		//gets the input
		String guess = stringScan.next();
		//calls hangman
		hangman(guess);
		}	
		//closes input; no more guesses
		stringScan.close();
	}
	
	
	public static void hangman(String guess) {
		//temporary string to progress through the game
		String hangman = "";
		
		for(int i = 0; i < word.length(); i++) {
			//if our guess is right at the location
			if(word.charAt(i) == guess.charAt(0)) {
			//update the hangman progress
				hangman += guess.charAt(0);
			} else if(progress.charAt(i) != '-') {
				//if that position has already guessed correct letter
				//keep it correct.
				hangman += word.charAt(i);
			} else {
				//if the character isn't correct and there is no progress 
				//at that position, insert the blank-indicating character
				hangman += '-';
			}
		}
		
		//if there progress is same as the hangman 
		//basically if there is no progress compared to the previous loop
		if(progress.equals(hangman)) {
			tries++;
			hangmanImage();
		} else { //if there is a progress, update
			progress = hangman;
		}
		//if progressing string equals the word we are guessing, 
		//we've guessed the word!
		if(progress.equals(word)) {
			System.out.println("Congratulation! You guessed the correct word! The word is " + word);
		}
		
	}
	
	public static void hangmanImage() {
		if (tries == 0) {
			System.out.println("Let's Start!");
			System.out.println("   ____________");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   | ");
			System.out.println("___|___");
		}
		if (tries == 1) {
			System.out.println("Wrong guess, try again");
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |           ");
			System.out.println("   |           ");
			System.out.println("   |");
			System.out.println("___|___");
		}
		if (tries == 2) {
			System.out.println("Wrong guess, try again");
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |           |");
			System.out.println("   |           |");
			System.out.println("   |");
			System.out.println("___|___");
		}
		if (tries == 3) {
			System.out.println("Wrong guess, try again");
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |           |");
			System.out.println("   |           |");
			System.out.println("   |          /  ");
			System.out.println("___|___      /   ");
		}
		if (tries == 4) {
			System.out.println("Wrong guess, try again");
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |           |");
			System.out.println("   |           |");
			System.out.println("   |          / \\ ");
			System.out.println("___|___      /   \\");
		}
		if (tries == 5) {
			System.out.println("Wrong guess, try again");
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |          _|_");
			System.out.println("   |         / | ");
			System.out.println("   |          / \\ ");
			System.out.println("___|___      /   \\");
		}
		if (tries == 6) {
			System.out.println("Wrong guess, try again");
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |          _|_");
			System.out.println("   |         / | \\");
			System.out.println("   |          / \\ ");
			System.out.println("___|___      /   \\");
		}
		if (tries == 7) {
			System.out.println("Wrong guess, try again");
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |        | ^  ^|");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |          _|_");
			System.out.println("   |         / | \\");
			System.out.println("   |          / \\ ");
			System.out.println("___|___      /   \\");
		}
		if (tries == 8) {
			System.out.println("GAME OVER!");
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |        | ^  ^|");
			System.out.println("   |        |  -  |");
			System.out.println("   |         \\___/");
			System.out.println("   |          _|_");
			System.out.println("   |         / | \\");
			System.out.println("   |          / \\ ");
			System.out.println("___|___      /   \\");
			System.out.println("The word was " + word);
		}
		
	}
	
}
