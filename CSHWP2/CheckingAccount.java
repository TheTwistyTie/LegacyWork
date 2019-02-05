public class CheckingAccount extends Account {
	private String id = "", name="";
	private double balance = 0.0;
	public CheckingAccount(String name, String id, double balance){
		super(name, id, balance);
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	public void deposit(double amount){
		double temp = getBalance();
		balance = getBalance() + amount;
		System.out.println("Amount of " + amount + " dollars was added to " + getAccountId() + " checking account. The old balance was " + temp + " and the new balance is " + balance + ".");
	}
	public void withdraw(double amount){
		double temp = getBalance();
		if(temp<amount){
			System.out.println("Insuficient funds. The old and new balance are both " + getBalance() + ".");
		}
		else{
			balance = temp - amount;
			if(balance<1000){
				System.out.print("Account balance is low. ");
			}
			System.out.println("Amount of " + amount + " dollars was withdrawn from " + getAccountId() + " checking account. The old balance was " + temp + " and the new balance is " + getBalance() + ".");
		}
	}
	public double getBalance(){
		double balance = this.balance;
		return balance;
	}
	public String getAccountId(){
		String id = this.id;
		return id;
	}
}