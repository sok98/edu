package edu2;

public class test1 {

	public static int total;

	public static void main(String[] args) {

		total = 10000;

		minus(2000);
		minus(1000);
		minus(3000);

		System.out.println(total);
		
		// Account ���
		Account acc = new Account(10000);

		acc.withdraw(2000);
		acc.withdraw(1000);
		acc.withdraw(3000);
		acc.deposit(1000);

		System.out.println(acc.getBalance());
		
		// �츮���� ���
		WRAccount bank1 = new WRAccount();
		bank1.deposit(1000);
		System.out.println(bank1.getBalance());
		
		//�������� ���
		KBAccount bank2 = new KBAccount();
		bank2.deposit(1000);
		System.out.println(bank2.getBalance());
	}

	public static void minus(int price) {
		total -= price;
	}
}

class Account {
	private int balance;
	public Account(int balance) {
		this.balance = balance;
	}
	
	public void withdraw(int value) throws Exception {
		if (balance >0) {
			balance -= value;			
		} else {
			throw new Exception("�ܰ����");
		}
	}
	public void deposit(int value) {
		balance += value;
	}
	public int getBalance() {
		return balance;
	}
}



// �츮����
class WRAccount {
	private int balance;
	public void deposit(int value) {
		balance += value * 1.1f;
	}
	public void withdraw(int value) {
		balance -= value;
	}
	public int getBalance() {
		return balance;
	}
}

// ��������
class KBAccount {
	private int balance;
	public void deposit(int value) {
		balance += value * 1.1f;
	}
	public void withdraw(int value) {
		balance -= value;
	}
	public int getBalance() {
		return balance;
	}
}
