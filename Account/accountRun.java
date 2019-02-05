import java.util.Scanner;
public class accountRun{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		LogIn logger = new LogIn();
		String username = "", password = "", tester = "", input = "";
		boolean tryAgain = true;
		System.out.println("Log in or Sign up? (L/S)");
		tester = scan.next().toLowerCase();
		if(tester.charAt(0) == 'l'){
			while(tryAgain) {
				System.out.println("Username:");
				username = scan.next().trim();
				if(username.equals("quit") || username.equals("Quit")){
					System.out.println("quitting...");
					try {
                	Thread.sleep(500);
            	} catch ( java.lang.InterruptedException ie) {
              		System.out.println(ie);
            	}
					break;
				}
				System.out.println("Password:");
				password = scan.next();
				if(logger.tryUsername(username)){
					tryAgain = false;
					if(logger.testPassword(username, password)){
						System.out.println("Logged In!");
					}
					else{
						System.out.println("Incorrect username or password. D:");
					}
				}
				else{
					System.out.println("Incorrect username or password.");
				}
			}
		}
		else if(tester.charAt(0) == 's'){
			System.out.println("What username would you like?");
			username = scan.next();
			if(!logger.tryUsername(username)){
				System.out.println("What would you like your password to be?");
				password = scan.next();
				if(logger.newAccount(username, password)){
					System.out.println("You're all set to log in!");
				}
				else{
					System.out.println("There was an error. Try again later.");
				}
			}
			else{
				System.out.println("Username is already taken.");
			}
		}
		else{
			System.out.println("Input not reconized.");
		}
	}
}