import java.util.*;
import java.io.*;
import java.text.DecimalFormat;
/**
 * Write a description of class Packages here.
 * 
 * @author (Alexander Keith) 
 * @version (1/26)
 */
public class Packages
{
   private ArrayList<Packets> shipmentList = new ArrayList<Packets>();
   private double totalWeight = 0.0;
   DecimalFormat fmt = new DecimalFormat ("0.##");
   public Packages() throws IOException {
       int id;
       double weight;
       String dest = "", orig = "";
       Scanner fileScan;
       fileScan = new Scanner (new File("packetData.txt"));
       while (fileScan.hasNext()){
           id = fileScan.nextInt();
           weight = fileScan.nextDouble();
           dest = fileScan.next().toUpperCase().trim();
           orig = fileScan.next().toUpperCase().trim();
           shipmentList.add(new Packets(id, weight, dest, orig));
           totalWeight = totalWeight + weight;
        }
    }
   public String toString(){
       String p1 = "";
       for( Packets p : shipmentList){
         p1 = p1 + p.toString();
       }
       return p1;
    }
   public void displayHeavyPackages(){
       for(Packets h: shipmentList){
           if(h.isHeavy() == true){
               System.out.print(h.toString());
            }
        }
    }
   public void displayInStatePackages(){
       for(Packets s: shipmentList){
           if(s.isInState() == true){
               System.out.print(s.toString());
            }
        }
    }
   public Packets MaxWeightPacket(){
       int heavy = 0;
       for(Packets w: shipmentList){
           if(w.getWeight() > shipmentList.get(heavy).getWeight()){
               heavy = shipmentList.indexOf(w);
            }
        }
       return shipmentList.get(heavy);
    }
   public void displayAverageWeight(){
       System.out.println(fmt.format(totalWeight/shipmentList.size()));
    }
   public void displayLocalPackets(){
       for(Packets l: shipmentList){
           if(l.destinationLocation() == "Local"){
               System.out.print(l.toString());
            }
        }
    }
   public void displayNonLocalPackets(){
       for(Packets l: shipmentList){
           if(l.destinationLocation() == "NonLocal"){
               System.out.print(l.toString());
            }
        }
    }
}
