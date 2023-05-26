package pakage1;

public class NumberFormatException {

	public static void main(String[] args) {

		String userDeposit = "Deposit today is 250";

		System.out.println(userDeposit.split(" ")[3]);

		int num1 = Integer.parseInt(userDeposit.split(" ")[3]);
		int num2 = Integer.parseInt("150");
		int num3 = Integer.parseInt("100");

		int totalDeposit = num1 + num2 + num3;

		System.out.println(totalDeposit);
	}
}