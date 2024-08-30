package JavaProject;

public class program {
	
	public static void main(String[]args) {
		Account acc1 =new Account("12345","Arti","4566",1000);
		Transaction t= new Transaction("123","saving");
		double balance=acc1.getBalance();
		double newbalance=t.withDraw(500,balance);
		t.deposite(1000,newbalance);
		double newbalance1 = acc1.InterestAmt();
		
	}
}