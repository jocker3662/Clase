package Ahorcado;

public class MagicWord2 {
	
	private static final String[] WORDS = {"theatre","capital",
			"cinema", "parachute", "traveller"};
	private boolean[] guessed;
	private String hiddenWord;
	
	public MagicWord2() {
		int numAlea = (int) (Math.random() * WORDS.length);
		hiddenWord = WORDS[numAlea];
		guessed = new boolean[hiddenWord.length()];
		for (int i=0; i<guessed.length; i++) {
			guessed[i] = false;
		}		
	}
	
	@Override
	public String toString() {
		String s = "";
		for(int i = 0; i < guessed.length; i++) {
			if (guessed[i] ) {
				s = s + hiddenWord.charAt(i);
			} else {				
				s  = s + "_ ";
			}
		}
		return s;
	}
	
	public void checkAnswer(String answer) {
		answer = answer.toLowerCase();
		if(answer.length() == 1) {
			checkLetter(answer.charAt(0));
		} else {
			checkWord(answer);
		}
	}
	
	private void checkLetter(char c) {
		for(int i = 0; i < hiddenWord.length(); i++) {
			if( c == hiddenWord.charAt(i)) {
				guessed[i] = true;
			}
		}
	}
	
	private void checkWord(String word) {
		if(word.contentEquals(hiddenWord)) {
			putAllGuessedToTrue();			
		}		
	}

	private void putAllGuessedToTrue() {
		for(int i = 0; i < guessed.length; i++) {
			guessed[i] = true;
		}		
	}
	
	public boolean isWinner() {
		for( int i = 0; i < guessed.length; i++) {
			if(!guessed[i]) {
				return false;
			}			
		}
		return true;
	}
	

	
	
}
