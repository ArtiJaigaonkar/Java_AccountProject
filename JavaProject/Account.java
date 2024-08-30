package JavaProject;

public class Account {
	
	private String accNo;
	private String accHolderName;
	private String IFSC_code;
	private double balance;
public Account() {
	// TODO Auto-generated constructor stub
}
	
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	public Account(String accNo, String accHolderName, String iFSC_code, double balance) {
		super();
		this.accNo = accNo;
		this.accHolderName = accHolderName;
		IFSC_code = iFSC_code;
		this.balance = balance;
		System.out.println("Account created for accNo: "+accNo);
	}
	public String getAccHolderName() {
		return accHolderName;
	}
	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}
	public String getIFSC_code() {
		return IFSC_code;
	}
	public void setIFSC_code(String iFSC_code) {
		IFSC_code = iFSC_code;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	

	double InterestAmt() {
    double principal = getBalance();
	 double year = 1;
	 double rate = 6;

      if(year>=0) {
    	  System.out.println(balance);
    	  double interest=(principal * rate*year)/365;
    	  System.out.println("interest "+interest);
    	  System.out.println("Balance after interest "+ (balance+interest));
    	 }
      return balance;
      }
	
}