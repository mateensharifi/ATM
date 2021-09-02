
public class ATMTester {
	public static void main (String [] args) throws Exception {

		ATM test = new ATM ();
		/**
		System.out.println(test.getID());
		System.out.println(test.deposit("1243235", 5));
		System.out.println(test.getID());
		System.out.println(test.deposit("4", 12));
		**/

		test.deposit("Winfrey", 25159684372.43);
		test.deposit("Bezos", 193495330293.43);
		test.deposit("Bezos", 20394353.35);
		test.withdraw("Bezos", 3593293);
		test.deposit("MrTheiss",64033.55);
		//test.withdraw("MrTheiss", 443964.46);
		System.out.println(test.checkBalance("Bezos"));
		System.out.println(test.checkBalance("Winfrey"));
		System.out.println(test.checkBalance("YoMama"));
		System.out.println(test.checkBalance("MrTheiss"));
	
	}
}
