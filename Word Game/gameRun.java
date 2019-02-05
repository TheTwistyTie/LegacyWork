import java.util.Scanner;
public class gameRun {
	public static void main(String[] args){
		String userPiece, compPiece = nullf, played;
		int matches;
		Scanner scan = new Scanner(System.in);
		GetWord compWord = new GetWord();
		LetterMatches match = new LetterMatches();
		PossibleLetters possible = new PossibleLetters();
		int wordFour = 3120;
		int wordFive = 5684;
		System.out.println("Do you want to play with 4 letters or 5? (4,5)");
		int diff = scan.nextInt();
		if(diff == 4){
			compPiece = compWord.getWord(wordFour);
			System.out.println("Please enter a four letter word");
			userPiece = scan.nextLine().toLowerCase();
		}
		if(diff == 5){
			compPiece = compWord.getWord(wordFive);
			System.out.println("Please enter a four letter word");
			userPiece = scan.nextLine().toLowerCase();
		}
		System.out.println(compPiece);
		System.out.println("Your turn. Play a word.");
		played = scan.nextLine().toLowerCase();
		matches = match.matches(played, compPiece);
		System.out.println(matches);
		Sorter.main(new String[0]);
	}
}