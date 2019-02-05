import java.util.*;
public class Turn {
	Scanner scan = new Scanner(System.in);
	private int turnCount = -1;
	private String userWord = "";
	private Player[] playerArray = new Player[2];
	public int Turn(int a){
		run(playerArray, a);
		if(a==0){
			return Turn(1);
		}
		else {
			return Turn(0);
		}
	}
	public void run(Player[] playerArray, int typeOfTurn){
		if(typeOfTurn==-1){
			System.out.print("Your secret word is:\t");
			userWord = scan.next();
			playerArray[0] = new User(userWord);
		}
		else {
			playerArray[typeOfTurn].play();
		}
		turnCount++;
	}
	public int getTurn(){
		return turnCount;
	}
	
}