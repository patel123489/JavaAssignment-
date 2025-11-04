package ExceptionHandling;

class InsufficentFundAmount extends Exception {
	double d;

	public InsufficentFundAmount(double d) {
		super(String.format("Your Account Need More : %s", d));
		this.d = d;
	}
}

class Bank {
	double balance;

	public void checkBalance() {
		System.out.println("Current Balance is :" + balance);
	}

	public void deposite(double amt) {
		balance += amt;
	}

	public void withdraw(double amt) throws InsufficentFundAmount {
		if (amt > balance) {
			throw new InsufficentFundAmount(amt - balance);
		} else {
			balance -= amt;
		}
	}
}

public class E003_CustomerException {
	public static void main(String[] args) {

		Bank B1 = new Bank();
		B1.checkBalance();
		B1.deposite(5000);
		B1.deposite(2000);
		B1.checkBalance();
		try {
			B1.withdraw(70000);
		} catch (InsufficentFundAmount e) {
			e.printStackTrace();
		}
		B1.checkBalance();

	}
}