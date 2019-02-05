abstract public class Account {
	private String id;
	private String name;
	private double balance;
	public abstract void deposit(double amount);
	public abstract void withdraw(double amount);
	public abstract double getBalance();
	public abstract String getAccountId();
	public Account(String name, String id, double balance){
		this.name = name;
		this.id = id;
		this.balance = balance;
	}
}