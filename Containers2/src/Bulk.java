
public class Bulk extends Container{
	private int weight;
	public Bulk(String s, String c,int f) {
		super(s, c);
		weight=f;
		
	}
	public double calcCost() {;
	double cost = 10*weight;
	return cost;
	}

}
