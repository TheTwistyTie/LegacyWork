import java.util.Scanner;

class encryption {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int x, key;
		boolean pass = false;
		String input = " ", eOrD = "", skey = "";
		System.out.println("Do you want to encrypt or decrypt? (E/D)");
		eOrD = scan.nextLine().toLowerCase();
		if(eOrD.charAt(0) == 'e'){
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
		}
		else if(eOrD.charAt(0) == 'd'){
			System.out.println("What would you like to decrypt?");
			input = scan.nextLine();
			System.out.println("What is the key?");
			skey = scan.nextLine();
			Decrypter message = new Decrypter(input, skey);
			System.out.println(message);
		}
		else{
			System.out.println("Input not reconized.");
		}
	}
}