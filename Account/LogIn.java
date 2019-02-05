import java.io.*;
public class LogIn{
	Encrypter encrypt = new Encrypter();
	public boolean tryUsername(String username){
		File f = new File("userdata\\" + username + ".txt");
		if(f.isFile()) { 
			return true;
		}
		else {
			return false;
		}
	}
	public boolean testPassword(String username, String password){
		String test = encrypt.decrypt(username, password);
		if(test.equals(password)){
			return true;
		}
		else{
			return false;
		}
	}
	public boolean newAccount(String username, String password){
		BufferedWriter writer = null;
		boolean pass = false;
		String encrypted = null;
		try{
			File logFile = new File("userdata\\" + username + ".txt");
            // This will output the full path where the file will be written to...
        //	System.out.println(logFile.getCanonicalPath());
            writer = new BufferedWriter(new FileWriter(logFile));
            encrypted = encrypt.encrypt(password);
            writer.write(encrypted);
            pass = true;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                // Close the writer regardless of what happens...
                writer.close();
            } catch (Exception e) {
            }
        }
        return pass;
	}
}