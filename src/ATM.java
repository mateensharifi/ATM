import java.util.HashMap;
import java.util.Random;

public class ATM {
	private String iD;
	private double balance = 0;
	
	public ATM () {
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
	}
	
	public double deposit (String inputID, double depositAmount) {
		if (!inputID.equals(iD)) {
			iD = inputID;
		}
		balance += depositAmount;
		return balance;
	}
	public String getID() {
		return iD;
	}
}
