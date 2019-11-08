package Ahorcado;

public class MagicWord {


	public static final String[] WORDS = {"perro","gato","abeja",};
	private boolean[] guessed;
	private String hiddenWord;
	
	public MagicWord() {
		int i = (int) (Math.random() * WORDS.length);		
		hiddenWord = WORDS[i];
		guessed = new boolean[hiddenWord.length()];
		for (int x = 0; x < guessed.length; x++) {
			guessed[x] = false;
			
			//System.out.println(guessed);
		}
		
		//System.out.println(hiddenWord);
	}
	
	public String guessWord(){
		String s = "";
		for(int i = 0; i < guessed.length; i ++) {
			if(guessed[i] == false) {
				
				s = s + " _ ";
			}else {
				s = s + hiddenWord.charAt(i);
				
			}
		}
		System.out.println();
		return s;
			
	}
	
	public void checkLetter(String letter) {
		char c = letter.charAt(0);
		
		for(int i = 0; i < guessed.length; i++) {
			if(  c == hiddenWord.charAt(i)) {
				guessed[i] = true;				
			}
		}
		WordGuess.count ++;		
	}
	
	//public boolean isCorrect(String letter) {
		
	//}
	
	public void checkWord(String letter) {
		if(letter.equals(hiddenWord)) {
			WordGuess.gameOver = true;
			System.out.println("YOU WIN!!!!!");
			System.out.println("You have  guess the correct word" + hiddenWord);
		}
		WordGuess.count ++;
	}
	
	
			
}
	

