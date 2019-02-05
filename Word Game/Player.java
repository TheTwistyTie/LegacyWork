import java.util.*;
abstract public class Player {
	private String guess;
	private boolean win;
	private ArrayList<PastGuess> guesses;
	public Player(String guess){
		this.guess = guess;
	}
	public abstract void play(ArrayList<String[]> dic);
	public String getGuess(){
		return guess;
	}
	public boolean getWin(){
		return win;
	}
	public void addGuess(String played, int result){
		PastGuess crafter = new PastGuess();
		crafter.setGuess(played);
		crafter.setResult(result);
		guesses.add(crafter);
	}
}