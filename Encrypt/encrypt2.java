import java.util.Scanner;

class encrypt2 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int x, key;
		boolean pass = false;
		String input = " ",word = " ", finished = "_";
		while(pass == false){
			System.out.println("What would you like to encrypt? Use _ instead of a space.");
			input = scan.next().toLowerCase();
			if(input.contains("_")){
				pass = true;
			}
			else{
				System.out.println("Remember to use _ instead of a space.");
			}
		}
		Encrypter code = new Encrypter(input);
	//	System.out.println(code);
	}
}