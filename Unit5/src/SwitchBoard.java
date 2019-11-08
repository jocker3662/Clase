
public class SwitchBoard  {
	
	private Call[] calls;
	private int numCall;
	
	public SwitchBoard(int numMaxCalls) {
		calls = new Call[numMaxCalls];
		numCall = 0;
	}
	
	public void registerCall(Call call) {
		if (numCall >= calls.length) {
			System.err.println("Exceeded max number of calls");
		}else {
			calls[numCall] = call;
			numCall ++;
		}		
	}
	
	public void print() {
		for(int i = 0; i < numCall; i++ ) {
			System.out.println(calls[i]);
		}		
	}
	
	public void print(int position) {
		if ( position >= 0 && position < numCall) {
			System.out.println(calls[position]);
		}
	}
	
	public int getNumRegisteredCalls() {
		return numCall;		
	}
	
	public double getTurnover()  {
		double total = 0;
		for( int i = 1 ; i < numCall; i++) {			
			total = total + calls[i].getCost();			
		}
		return total;
	}
}
