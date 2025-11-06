package Threads;

import java.util.Scanner;

class Account {
	double balance;

	Account(double balance) {
		this.balance = balance;
	}

	public boolean checkbalance(double amount) {
		boolean b = false;
		if (amount > balance) {
			b = false;
		} else {
			b = true;
		}
		return b;
	}

	public void withdraw(double amount) {
		balance = balance - amount;
		System.out.println("Current Balance is :" + balance);
	}
}

class Customer extends Thread {
	String name;
	Account account;

	Customer(String name, Account account) {
		this.name = name;
		this.account = account;
	}

	public void run() {
		synchronized (account) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Amount :" + name);
			double amount = sc.nextDouble();
			if (account.checkbalance(amount)) {
				account.withdraw(amount);
			} else {
				System.out.println("Insufficient amount.....");
			}
		}
	}
}

public class T004_BlockSync {
	public static void main(String[] args) {

		Account ac = new Account(50000);

		Customer c1 = new Customer("Om", ac);

		Customer c2 = new Customer("Patel", ac);

		c1.start();

		c2.start();
	}
}