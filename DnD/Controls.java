import java.util.*;
public class Controls{
	Random rand = new Random();
	public void Controls(){
	}
	public int diceRoll(int size){
		return rand.nextInt(size)+1;
	}
	public boolean isMax(int size, int roll){
		boolean max = false;
		if(roll==size){
			max = true;
		}
		return max;
	}
	public boolean isMin(int roll){
		boolean min = false;
		if(roll==1){
			min = true;
		}
		return min;
	}
	public void diceControl(int size){
		int roll = diceRoll(size);
		boolean min = isMin(roll);
		boolean max = isMax(size, roll);
	}
	public void multiDiceRoll(int num, int size){
		int[] rolls = new int[num];
		boolean[] max = new boolean[num];
		boolean[] min = new boolean[num];
		for(int i : rolls){
			rolls[i] = rand.nextInt(size);
			min[i] = isMin(rolls[i]);
			max[i] = isMax(size, rolls[i]);
		}
	}
}