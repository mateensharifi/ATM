import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class ATM {
	private String iD;
	private double balance = 0;
	Map<String,Double> bankAccounts = new HashMap<String,Double>();
	public ATM () {
		
		
		//Note: This code is lit but unfortunately it's kind of extraneous now
		/**
		char[] code = new char[10];
		for (int i = 0; i < 10; i++) {
			Random r = new Random();
			code[i] = (char)(r.nextInt(26) + 'a');
		}
		StringBuilder toRet = new StringBuilder();
		for (int i = 0; i < 10; i++) {
			toRet.append(code[i]);
		}
		iD = toRet.toString();
		System.out.println("Your ID: " + iD);
		*/
	}
	
	public void deposit (String inputID, double depositAmount) {
		/**if (!inputID.equals(iD)) {
			iD = inputID;
		} */
		
		bankAccounts.put(inputID,depositAmount);
		
		//balance += depositAmount;
		
	}
	public double checkBalance(String inputID) throws Exception{
		if(!bankAccounts.containsKey(inputID)) {
			throw new Exception("Account doesn't exist");
		}
		return bankAccounts.get(inputID);
	}
	public void withdraw(String inputID, double withdrawAmount) throws Exception {
		double currentAmount = bankAccounts.get(inputID);
		if(withdrawAmount > currentAmount) {
			throw new Exception("Withdraw amount exceeds current balance");
		}
		double newAmount = bankAccounts.get(inputID) - withdrawAmount;
		bankAccounts.put(inputID, newAmount);
		
	}
	public String getID() {
		return iD;
	}
	
	
	
}
