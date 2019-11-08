
public class Products {
	public static void main(String[] args) {
		
		Product p = new Product();
		System.out.println(p.product(4,15));
	}

}

class Product{
	static int numCalls= 0;
	public int product(int a, int b) {
		System.out.println("CALL NUMBER:"+ numCalls);
		numCalls ++;
		return product(a, b);
	}
}
