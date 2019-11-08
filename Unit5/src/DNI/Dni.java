package DNI;

public class Dni {
	
	public static final char[] LETTERS = {'T','R','W','A','G','M','Y','F','P','D','X',
			'B','N','J','Z','S','Q','V','H','L','C','K','E'};

	
	
	private int number;
	private char letter;
	
	public Dni() {
		number = 0;
		letter = LETTERS[0];
	}
	
	public int getNumber() {
		return getNumber();
		
	}
	
	public Dni(int number, char letter) {
		this.number = number;
		this.letter = letter;
		if (letter != LETTERS[number % 23]) {
			this.number = -number;
		}
	}
	
	public char getLetter() {
		return letter;
	}
	
	public Dni(int number) {
		this.number = number;
		checkLetter();
	}
	
	public void setNumber(int number) {
		this.number = number;
		checkLetter();
		}
	
	
	public Dni( String s) {
		letter = s.charAt(s.length() -1);
		number = Integer.parseInt(s.replaceAll("[^\\d]", ""));
		checkLetter();
		}
	
	
	@Override
	public String toString() {
		return  "" + number + letter;	
		
	}
	
	public String toFormattedString() {	
		StringBuilder s = new StringBuilder(String.valueOf(number));
		if (number > 999) {
			s.insert(s.length()-3,'.');
		}
		if (number > 999999) {
			s.insert(s.length()-7,'.');
		}
		if (number > 999999999) {
			s.insert(s.length()-11,'.');
		}
		return s.toString() + "-" + letter;
		/*String s = "" + number;
		int length = s.length();
		
		String last3 = s.substring(s.length()-3);
		String strMiddle = s.substring(s.length()-6, s.length()- 3);
		String strFinal = s.substring(s.length()-9,  s.length()-6);
	
		return  strFinal + "." + strMiddle + "." + last3 ;
		*/
		
	}
	
	public static char letterForDni(int number) {
		return LETTERS[number % 23];
	}
	
	public static String NifForDni(int number) {
		return "" + number + letterForDni(number);
		// return new Dni(number).toString();
	}
	
	public boolean isCorrect() {
		if (number >= 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public void checkLetter() {
		if(number >= 0) {
			if (LETTERS[number % 23] != letter) {
				number = -number;
			}
		} else {
			if (LETTERS[ -number % 23] == letter) {
				number = -number;
			}
		}
		
	}
}
		


	


