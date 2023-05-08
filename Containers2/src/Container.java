
public abstract class Container {
	protected String id;
	protected String destination;
	public Container(String id, String destination) {
		this.id = id;
		this.destination =destination;
	}
	abstract public double calcCost();
}