package Synchronized1;
//
//class Account {
//	private int balance = 1000;
//	
//	public int getBalance() {
//		return balance;
//	}
//	
//	public void withdraw(int money) { // 동기화 해주지 않을 경우 
//		if(balance >= money) {
//			try {Thread.sleep(1000);} catch(InterruptedException e) {}
//			balance -= money;
//		}
//	}
//}
//
//class Runnable1 implements Runnable {
//	Account acc = new Account();
//	
//	public void run() {
//		while(acc.getBalance() > 0) {
//			int money = (int)(Math.random() * 3 + 1) * 100; 
//			acc.withdraw(money);
//			System.out.println("balance: " + acc.getBalance());
//		}
//	}
//}
//
//
//public class SynchronizedEx1 {
//	public static void main(String[] args) {
//		Runnable r = new Runnable1();
//		new Thread(r).start();
//		new Thread(r).start();
//	}
//}
//
////	balance: 700
////	balance: 700
////	balance: 400
////	balance: 300
////	balance: 0
////	balance: -200   // 음수가 출력됨.



///////////////////////////////////////////



class Account {
	private int balance = 1000;
	
	public synchronized int getBalance() {
		return balance;
	}
	
	public synchronized void withdraw(int money) { // 동기화 해줄 경우 
		if(balance >= money) { 
			try {Thread.sleep(1000);} catch(InterruptedException e) {}
			balance -= money;
		}
	}
}

class Runnable1 implements Runnable {
	Account acc = new Account();
	
	public void run() {
		while(acc.getBalance() > 0) {
			int money = (int)(Math.random() * 3 + 1) * 100; 
			acc.withdraw(money);
			System.out.println("balance: " + acc.getBalance());
		}
	}
}


public class SynchronizedEx1 {
	public static void main(String[] args) {
		Runnable r = new Runnable1();
		new Thread(r).start();
		new Thread(r).start();
	}
}
//	balance: 700
//	balance: 700
//	balance: 400
//	balance: 400
//	balance: 100
//	balance: 100
//	balance: 0  // 음수가 출력되지 않음.



