public class Packet {
	private int idNumber;
	private double weight;
	private String destination;
	public Packet(int id, double wei, String dest){
		idNumber = id;
		weight = wei;
		destination = dest;
	}
	public boolean isHeavy(){
		if(weight>10.0){
			return true;
		}
		else {
			return false;
		}
	}
	public String toString(){
		return idNumber + " " + " " + weight + " " + destination;
	}
	public double getWeight(){
		return weight;
	}
	public String getDestination(){
		return destination;
	}
}