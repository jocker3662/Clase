
public class Exercise5 {

	public static void main(String[] args) {
		
		SwitchBoard sb = new SwitchBoard(20);
		sb.registerCall(new Call(111, 333, 15, 1, false));
		sb.registerCall(new Call(222, 333, 15, 1, false));
		sb.registerCall(new Call(555, 333, 15, 1, false));
		sb.print();
		System.out.println("----------------------------");
		sb.print(1);
		System.out.println("-----------------------------");
		
		System.out.println("Num Calls: " + sb.getNumRegisteredCalls());
		System.out.println("Total: " + sb.getTurnover());
		
		

	}

}
