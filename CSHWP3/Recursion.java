public class Recursion {
	public String toString(Packet[] list, int n){
		n = n - 1;
		if(n==0){
			return "\t" + list[n].toString();
		}
		else{
			return toString(list, (n)) + "\n\t" + list[n].toString();
		}
	}
	public void displayHeavyPackets (Packet[] list, int n){
		n = n - 1;
		if(n==0){
			if(list[n].isHeavy()){
				System.out.print("\t" + list[n].toString());
			}
		}
		else {
			displayHeavyPackets(list, n);
			if(list[n].isHeavy()){
				System.out.print("\t" + list[n].toString() + "\n");
			}
		}
	}
	public void displayPacketsToDest (Packet[] list, int n, String dest){
		n = n - 1;
		if(n==0){
			if(list[n].getDestination().equals(dest)){
				System.out.print(list[n].toString());
			}
		}
		else{
			displayPacketsToDest(list, n, dest);
			if(list[n].getDestination().equals(dest)){
				System.out.print("\t" + list[n].toString() + "\n");
			}
		}
	}
	public int countPacketsToDest(Packet[] list, int n, String dest){
		n = n - 1;
		if(n==0){
			if(list[n].getDestination().equals(dest)){
				return 1;
			}
			else {
				return 0;
			}
		}
		else{
			if(list[n].getDestination().equals(dest)){
				return 1 + countPacketsToDest(list, n, dest);
			}
			else {
				return 0 + countPacketsToDest(list, n, dest);
			}
		}
	}
	public Packet maxWeightPacket(Packet[] list, int n){
		n = n - 1;
		if(n==0){
			return list[n];
		}
		else if(list[n].getWeight() > maxWeightPacket(list, n).getWeight()) {
			return list[n];
		}
		else {
			return maxWeightPacket(list, n);
		}
	}
	public double maxWeight(Packet[] list, int n){
		n = n - 1;
		if(n==0){
			return list[n].getWeight();
		}
		else if(list[n].getWeight() > maxWeight(list, n)){
			return list[n].getWeight();
		}
		else {
			return maxWeight(list, n);
		}
	}
}