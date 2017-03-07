public class Node{
	private static Account a1;
	private static Account a2;
	private static float m;
	private static Transaction t;
	public static void main(String[] args){
		a1 = new Account("Jianshu",100);
		a2 = new Account("Lei",100);
		m = 200;
		t = new Transaction();
		t.deposite(a2,200);
		t.transfer(a1,a2,m);
		System.out.println("Balance of toAccount: " + a1.getBalance());
		System.out.println("Balance of fromAccount: " + a2.getBalance());
	}
}

class Account{
	private String name;
	private float balance;
	
	public Account(String name, float balance){
		this.name = name;
		this.balance = balance;
	}

	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public float getBalance(){
		return balance;
	}
	public void setBalance(float balance){
		this.balance = balance;
	}
}

class Transaction{
	private Account fromAccount;
	private Account toAccount;
	private float amount;

	public void transfer(Account toAccount,Account fromAccount,float amount){
		if(fromAccount.getBalance()>=amount){
		fromAccount.setBalance(fromAccount.getBalance() - amount);
		toAccount.setBalance(toAccount.getBalance() + amount);}else{
			System.out.println("Not enough money when transfer!");
		}
	}

	public void deposite(Account toAccount,float amount){
		toAccount.setBalance(toAccount.getBalance()+amount);
	}

	public void withdrawl(Account fromAccount,float amount){
		if(fromAccount.getBalance()>=amount){
		fromAccount.setBalance(fromAccount.getBalance()-amount);}else{
			System.out.println("Not enough money when withdrawl!");
		}
	}

}