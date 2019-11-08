import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class MyPolynomial {
	private double[] coeffs;

	public MyPolynomial(double... coeffs) { // varargs
		this.coeffs = coeffs; // varargs is treated as array
	}

	public MyPolynomial(String filename) {
		Scanner in = null;
		try {
			in = new Scanner(new File(filename)); // open file
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		int degree = in.nextInt(); // read the degree
		coeffs = new double[degree + 1]; // allocate the array
		for (int i = 0; i < coeffs.length; ++i) {
			coeffs[i] = in.nextDouble();
		}
	}
	
	public int getDegree() {
		return coeffs.length - 1;		
	}
	
	@Override
	public String toString() {		
		String s = "";
		String term;
		for(int i = 0; i < coeffs.length; i ++) {	
			if(coeffs[i] != 0) {				
				if (i == 0) {
					term = "" + coeffs[i];
				} else {
					if ( i == 1) {
						term = coeffs[i] + "x";
					} else {
						term = coeffs[i] + "x^" + i;
					}
				}
				if ( s.length() != 0) {
					s = term + "+" + s;
				} else {
					s = term + s;
				}
			}			
		}
		return s;
	}
	
	public double evaluate( double x) {
		double sum = 0;
		for(int i = 0; i <coeffs.length; i++) {
			double result = coeffs[i]*Math.pow(x, i);
			sum += result;
		}
		return sum;
	}
	
	public MyPolynomial add(MyPolynomial p) {
		double[] result, biggest, smallest;
		if(coeffs.length > p.coeffs.length) {
			biggest = coeffs;
			smallest = p.coeffs;
		} else {
			biggest = p.coeffs;
			smallest = coeffs;
		}
		result = new double[biggest.length];		
		 for(int i = 0; i < biggest.length; i ++) {
			 result[i] = biggest[i];			 
		 }
		 for (int i = 0; i < smallest.length; i++) {
			 result[i] += smallest[i];
		 }
		 return new MyPolynomial(result);
	}	
	
}

