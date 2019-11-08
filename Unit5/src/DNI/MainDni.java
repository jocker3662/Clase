package DNI;

public class MainDni {

	public static void main(String[] args) {
		Dni d1 = new Dni(12121212);
		System.out.println(d1);
		
		Dni d2 = new Dni("18.957.690-F");
		System.out.println(d2);
		System.out.println(d2.isCorrect());
		
		Dni d3 = new Dni(123456789);
		System.out.println(d3.toFormattedString());
		
		System.out.println(Dni.letterForDni(123443211));
		System.out.println(Dni.NifForDni(123454321));

	}

}
