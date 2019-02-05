import java.util.*;
import java.io.*;
public class TestPackages{
	public static void main(String[] args) throws IOException {
		Packet[] packetList = new Packet[100];
		Recursion rec = new Recursion();
		Scanner fScan = new Scanner(new File("packetData.txt"));
		int id, counter = 0;
		double weight;
		String dest;
		Packet pack;

		//NumberFormat fmt = new DecimalFormat("#.##");
		while(fScan.hasNext()){
			id = fScan.nextInt();
			weight = fScan.nextDouble();
			dest = fScan.next();
			pack = new Packet(id, weight, dest);
			packetList[counter] = pack;
			counter++;
		}
		System.out.println("All Packets");
		System.out.println(rec.toString(packetList, counter));
		System.out.println("\nAll Heavy Packets");
		rec.displayHeavyPackets(packetList, counter);
		System.out.println("\nAll Packets with destination NY");
		rec.displayPacketsToDest(packetList, counter, "NY");
		System.out.println("\nThe number of packets with destication CT is: " + rec.countPacketsToDest(packetList, counter, "CT"));
		System.out.println("\nThe packet object with max weight is: " + rec.maxWeightPacket(packetList, counter));
		System.out.println("\nThe max weight of all packets is: " + rec.maxWeight(packetList, counter));
	}
}