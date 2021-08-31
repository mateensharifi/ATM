
public class ATMTester {
	public static void main (String [] args) {
		ATM test = new ATM ("123", 5);
		System.out.println(test.getID());
		System.out.println(test.deposit("123", 5));
		System.out.println(test.getID());
	}
}
