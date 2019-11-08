
public class Call {
	private int call;
	private int number;
	private int numSource;
	private int band;
	private int numDestination;
	private int seconds;
	private boolean local;
	private double cost;
	
	public static final double LOCAL_COST = 0.15;
	public static final double BAND1_COST = 0.20;
	public static final double BAND2_COST = 0.25;
	public static final double BAND3_COST = 0.30;
	
	
	public Call(int numSource, int numDestination, int seconds, int band,
				boolean local) {
		this.band = band;
		this.numDestination = numDestination;
		this.seconds = seconds;
		this.numSource = numSource;
		this.local = local;
		cost = calculateCost();
	}
	
	public double getCost() {
		return cost;
	}
	
	@Override
	public String toString() {
		return "N. source: " + numSource + " N. dest.:" +
				numDestination + " Seconds: " + seconds + 
				" Band: " + band;		
	}
	
	private double calculateCost() {
		if(local) {
			return seconds * LOCAL_COST;
		} else {
			switch (band) {
			case 1: return  seconds * BAND1_COST;					
			case 2: return  seconds * BAND2_COST;					
			case 3: return  seconds * BAND3_COST;					
			default:
				return -1;
			}
		}		
	}
}
