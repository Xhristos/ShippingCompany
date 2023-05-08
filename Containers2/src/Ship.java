import java.util.ArrayList;

public class Ship {
	 int capacity;
	 ArrayList< Container > containers = new ArrayList<>();
	public Ship(int cappacity) {
		this.capacity = cappacity;
	}
	public void addContainer(Container aContainer){
		
		if (containers.size() >= capacity) {
			System.out.println("error ship is full");
		}else containers.add(aContainer);		
		}
		
	public double calcTotalCost() {
		double totalcost = 0;
		double max=0;
		int i=0;
		for(Container aContainer : containers) {
			totalcost += aContainer.calcCost();
			
		if(max < aContainer.calcCost());{
			max = aContainer.calcCost();
			Container temp=containers.get(0);
			
		  containers.set(0, aContainer);
		  containers.set(i, temp);
		}
		i++;
		}
		
		return totalcost;
	}

}
