
public class MainClass4 {

	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		System.out.println(r);
		r.moveTo(4,4);
		System.out.println(r);
		
		Rectangle r2 = new Rectangle(new Point(1,1), 8, 6);
		System.out.println(r2);
		
		Rectangle r3 = new Rectangle (new Point(2,2), new Point (4, 5));
		System.out.println(r3);
		
		Segment s = new Segment(new Point(4, 5), new Point(6, 8));
		Rectangle r4 = new Rectangle(s);
		System.out.println(r4);
		
		System.out.println(r4.getArea());		
		
		System.out.println(r4.getPoint());
		Point p = r4.getPoint();
		System.out.println(p);
		
		System.out.println("Bottom Left Point " + r4.getBottomLeftPoint());
		System.out.println("Botttom Right Point " + r4.getBottomRightPoint());		
		System.out.println("Top Rigth Point " + r4.getTopRigthPoint());
		System.out.println("Top Left Point " + r4.getTopLeftPoint());
		
		System.out.println("/ New measurements / ");
		
		//Creamos uno nuevo para ni modificar los datos anteriores
		Rectangle r5 = new Rectangle(new Point(5, 6), 10, 8);
		System.out.println(r5);
		
		System.out.println("Bottom Left Point " + r5.getBottomLeftPoint());
		System.out.println("Botttom Right Point " + r5.getBottomRightPoint());		
		System.out.println("Top Rigth Point " + r5.getTopRigthPoint());
		System.out.println("Top Left Point " + r5.getTopLeftPoint());
		
		
	}
}
