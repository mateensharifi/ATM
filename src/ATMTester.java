
public class ATMTester {
	public static void main (String [] args) {
		ATM test = new ATM ();
		System.out.println(test.getID());
		System.out.println(test.deposit("1243235", 5));
		System.out.println(test.getID());
	}
}
