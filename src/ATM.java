
public class ATM {
	private String iD;
	private double balance;
	
	public ATM (String iD, double balance) {
		this.iD = iD;
		this.balance = balance;
	}
	
	public double deposit (String inputID, double depositAmount) {
		if (!inputID.equals(iD)) {
			iD = inputID;
		}
		balance += depositAmount;
		return balance;
	}
}
