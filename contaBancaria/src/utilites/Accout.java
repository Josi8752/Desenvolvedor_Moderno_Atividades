package utilites;

public class Accout {

	
	private int number;
	private  String holder;
	 private  double balance;
	 
	public Accout(int number, String holder) {

		this.number = number;
		this.holder = holder;
	}

	public Accout(int number, String holder, double initialDeposity) {
	
		this.number = number;
		this.holder = holder;
		deposit(initialDeposity);
	}

	public int getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

public void  deposit(double ammout) {
	balance	+= ammout;
	}
	public void  withdraw(double ammout) {
	  balance -= ammout + 5.00;
	}


	public String toString() {
		return  "Accout " 
	+ number
	+ ", Holder: " 
	+ holder
	+ ", Balance: $  "
	+ String.format("%.2f",balance) ;
	}
	
}
