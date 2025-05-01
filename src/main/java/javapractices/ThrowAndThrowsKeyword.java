package javapractices;

public class ThrowAndThrowsKeyword {

	public static void main(String[] args) {
		Banking banking = new Banking(1000);
		banking.withdrawMoney(3000);

	}

}

class Banking {

	int accBal;

	public Banking(int accBal) {
		this.accBal = accBal;
	}

	public void withdrawMoney(int amountToWithdraw) throws RuntimeException {

		System.out.println("Your current accout balace is = " + accBal);

		if (amountToWithdraw > accBal) {
			throw new RuntimeException("Please enter withdraw amount i.e " + amountToWithdraw
					+ " which must be less than account balance " + accBal);
		}

		accBal = accBal - amountToWithdraw;
		System.out.println("You have withdraw " + amountToWithdraw + " successfully");
		System.out.println("Your updated accout balace is = " + accBal);

	}

}