
public class MyPolynomialMain {

	public static void main(String[] args) {
		MyPolynomial p1 = new MyPolynomial(1.1, 2.2, 3.3);
		MyPolynomial p2 = new MyPolynomial(1.1, 2.2, 3.3, 4.4, 5.5);
		// Can also invoke with an array
		double[] coeffs = { 3.0, 6.0, 2.0, 3.0, 0.0, 5.0 };
		MyPolynomial p3 = new MyPolynomial(coeffs);
		MyPolynomial p4 = new MyPolynomial("poly");
		
		System.out.println(p3.toString());
		System.out.println(p3.evaluate(1));
		
		 MyPolynomial p5 = p3.add(p2);

	}

}
