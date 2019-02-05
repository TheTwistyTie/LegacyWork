import java.util.*;
import java.io.*;
public class Run {
	Scanner scan = new Scanner(System.in);
	Scripts comm = new Scripts();
	ArrayList<String[]> dic = new ArrayList<String[]>();
	private Player[] playerArray = new Player[2];
	private int turnCount = 0;
	public void Run() throws IOException {
		System.out.println("Loading Dictionary...");
		comm.dicCreator();
		System.out.println("Initializing computer player...");
		playerArray[1] = new ComputerPlayer(comm.setComputerWord());
		System.out.println("Initializing human player...");
		playerArray[0] = new User(comm.setUserWord());
		System.out.println(playerArray[1].getGuess());
		runRepeat();
	}
	public void runRepeat(){
		int player = comm.playerSelect();
		while(playerArray[player].getWin() == false){
				playerArray[player].play(comm.getDictionary());
				runRepeat();
		}
	}
}