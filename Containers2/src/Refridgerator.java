
public class Refridgerator extends  Container {
	private int power;
	public Refridgerator(String id, String destination,int power) {
		super(id, destination);
		this.power = power;
	}
	
	public double calcCost() {
		if(destination.contentEquals("Athena")){
			double cost = 2000*power;
			return cost;
		}
		
		if(destination.contentEquals("Kavala")) {
			double cost = 1000*power;
			return cost;
		}
		if(destination.contentEquals("Hraklio")) {
			double cost = 2500*power;
			return cost;
		}else {
			//if it is not in the base routine
				double cost = 3000*power;
				return cost;
		}
	}

}
