package Ahorcado;

import java.util.Scanner;

public class WordGuess {
	static String letter;
	static int count = 0;
	static boolean gameOver = false;

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);		
		MagicWord magicWord = new MagicWord();
		
		
		
		while(!gameOver) {
			System.out.println("Enter a letter:");
			System.out.println("Attempt " + count+ ": " + magicWord.guessWord());
			letter = input.next();
			System.out.println();
			magicWord.checkLetter(letter);
			magicWord.checkWord(letter);
			
			
			
		}

	}

}
