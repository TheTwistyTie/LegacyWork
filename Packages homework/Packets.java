
/**
 * Describes Packets.
 * 
 * @author (Alexander Keith) 
 * @version 1/25
 */
public class Packets
{
    private int idNumber;
    private double weight;
    private String stateDest = "", stateOrig = "";
    
    public Packets(int id, double weight, String dest, String orig){
        idNumber = id;
        this.weight = weight;
        stateDest = dest;
        stateOrig = orig;
    }
  
    public String toString(){
        return idNumber + "\t" + weight + "\t" + stateDest + "\t" + stateOrig + "\n";
    }
    
    public boolean isHeavy(){
        return weight > 10; 
    }
    
    public boolean isInState(){
        return stateDest.equals(stateOrig);
    }
    
    public double getWeight(){
        return weight;
    }
    
    public String destinationLocation(){
         if( stateDest.equals("CT") || stateDest.equals("MA") || stateDest.equals("RI") || stateDest.equals("NY")) {
            return "Local";
        }
        else {
            return "NonLocal";
        }
    }
    
}
