import java.util.*;
public class TestAccount{
	public static void main(String[] args){
		String accId = "";
		double accBal = 0.0;
		Account[] accounts = new Account[2];
		accounts[0] = new CheckingAccount("John", "1023", 239.91);
		accounts[1] = new SavingAccount("John", "1024", 324.12);
		accounts[1].deposit(1023.12);
		accounts[0].deposit(120.30);
		accId = accounts[0].getAccountId();
		accBal = accounts[0].getBalance();
		System.out.println("The current balance of Checking account " + accId + " is: " + accBal);
		accId = accounts[1].getAccountId();
		accBal = accounts[1].getBalance();
		System.out.println("The current balance of Savings account " + accId + " is: " + accBal);
		accounts[1].withdraw(200.00);
		accounts[0].withdraw(200.00);
	}
}