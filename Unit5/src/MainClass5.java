
public class MainClass5 {
	
	public static void main(String[] argv) {
		Point[] arrayP = new Point[10];
		
		for (int i=0; i<arrayP.length;i++) {
			arrayP[i]=new Point(i,i);
		}
		
		/* Este for es para leer el array entero
		  for(Point p : arrayP){
		  p.set(0); // Pones 0 en todas las x //
		  System.out.println(p);
		 }
		  */
		 
		for (int i=0; i<arrayP.length;i++) {
			System.out.println(arrayP[i]);
		}
		/* Rectangle[] arrayR
		 	arrayR = new Rectangle[10];
		 
		 */
		Rectangle[] arrayR = new Rectangle[10];
		for (int i=0; i<arrayR.length; i++) {
			arrayR[i]=new Rectangle(arrayP[i], 1, 1);
		}
		for (int i=0; i<arrayR.length; i++) {
			System.out.println(arrayR[i]);
		}
	}
	

}
