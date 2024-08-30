package JavaProject;

public class Transaction {
	
	private String transactionNo;
	private String transactiontype;
	
	public Transaction(String transactionNo, String transactiontype) {
		super();
		this.transactionNo = transactionNo;
		this.transactiontype = transactiontype;
	}
	public Transaction() {
		// TODO Auto-generated constructor stub
	}
	
	double withDraw(double withDrawAmt, double balance) {
	
		if(balance>=withDrawAmt) {
			balance=balance-withDrawAmt;
			System.out.println("Amount withDraw " +withDrawAmt+"with TransactionNo" +transactionNo+" and Transaction Type :"+transactiontype);
			System.out.println("Your current balance is :"+balance);
			return balance;
		}
		
		else {
			System.out.println("Insufficient balance");
		}
		return balance;
		
		}
	
	void deposite(double depositeAmount,double balance) {
		
		
		balance=balance + depositeAmount;
		System.out.println("Amount Deposite " +depositeAmount+"with TransactionNo" +transactionNo+" and Transaction Type :"+transactiontype);
		System.out.println("Your current balance is :"+balance);
	}
}


	
		 