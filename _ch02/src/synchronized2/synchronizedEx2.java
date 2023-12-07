package synchronized2;

import java.util.ArrayList;

/*class Customer implements Runnable {
	private Table table;
	private String food;
	
	Customer(Table table, String food) {
		this.table = table;
		this.food = food;
	}
	
	public void run() {
		while(true) {
			try { Thread.sleep(10);} catch(InterruptedException e) {}
			String name = Thread.currentThread().getName();
			
			if(eatFood()) System.out.println(name + " eat a " + food);
			else System.out.println(name + "failed to eat. :( ");
		}
	}
	boolean eatFood() { return table.remove(food); }
}




class Cook implements Runnable {
	private Table table;
	
	Cook(Table table) { 
		this.table = table; 
	}
	
	public void run() {
		while(true) {
			int idx = (int)(Math.random() * table.dishNum());
			table.add(table.dishNames[idx]);
			try {Thread.sleep(100);} catch(InterruptedException e) {}
		}
	}
}




class Table {
	String[] dishNames = {"donut", "donut", "burger"};
	
	final int MAX_FOOD = 6;
	
	private ArrayList<String> dishes = new ArrayList<>();
	
	public synchronized void add(String dish) {
		if(dishes.size() >= MAX_FOOD) return;
		dishes.add(dish);
		System.out.println(dishes.toString());
	}
	
	public boolean remove(String dishName) {
		synchronized(this) {
			while(dishes.size() == 0) {
				String name = Thread.currentThread().getName();
				System.out.println(name+" is waiting.");
				try { Thread.sleep(500);} catch(InterruptedException e) {}
			}
			
			for(int i=0; i<dishes.size(); i++)
				if(dishName.equals(dishes.get(i))) {
					dishes.remove(i);
					return true;
				}
		}
		return false;
	}
	public int dishNum() { return dishNames.length; }
}




public class synchronizedEx2 {
	public static void main(String[] args) throws Exception {
		Table table1 = new Table(); // 여러 스레드가 공유하는 객체
		
		new Thread(new Cook(table1), "COOK").start();
		new Thread(new Customer(table1, "donut"), "CUST1").start();
		new Thread(new Customer(table1, "burger"), "CUST2").start();
		
		Thread.sleep(5000);
		System.exit(0);
	}
}*/

//	[burger]
//	CUST1 is waiting.
//	CUST2 eat a burger
//	CUST1 is waiting.
//	CUST1 is waiting.
//	CUST1 is waiting.
//	CUST1 is waiting.
//	CUST1 is waiting.
//	CUST1 is waiting.
//	CUST1 is waiting.
//	CUST1 is waiting.
//	CUST1 is waiting.






//////////////////////////////////////////////





class Customer implements Runnable {
	private Table table;
	private String food;
	
	Customer(Table table, String food) {
		this.table = table;
		this.food = food;
	}
	
	public void run() {
		while(true) {
			try { Thread.sleep(10);} catch(InterruptedException e) {}
			String name = Thread.currentThread().getName();
			
			table.remove(food);
			System.out.println(name + " eat a " + food);
		}
	}
}




class Cook implements Runnable {
	private Table table;
	
	Cook(Table table) { 
		this.table = table; 
	}
	
	public void run() {
		while(true) {
			int idx = (int)(Math.random() * table.dishNum());
			table.add(table.dishNames[idx]);
			try {Thread.sleep(100);} catch(InterruptedException e) {}
		}
	}
}




class Table {
	String[] dishNames = {"donut", "donut", "burger"};
	
	final int MAX_FOOD = 6;
	
	private ArrayList<String> dishes = new ArrayList<>();
	
	public synchronized void add(String dish) {
		while(dishes.size() >= MAX_FOOD) {
			String name = Thread.currentThread().getName();
			System.out.println(name + " is waiting");
			try {
				wait(); // COOK 스레드를 기다리게 함.
				Thread.sleep(500);
			} catch(InterruptedException e) {}
		}
		dishes.add(dish);
		
		notify(); // CUST 스레드를 깨움.
		System.out.println(dishes.toString());
	}
	
	

	public void remove(String dishName) {
		synchronized(this) {
				String name = Thread.currentThread().getName();
				
				while(dishes.size() == 0) {
					System.out.println(name +" is waiting.");
					try { 
						wait(); // CUST 스레드를 기다리게 함.
						Thread.sleep(500);
					} catch(InterruptedException e) {}
				}
				
				while(true) {
					for(int i=0; i<dishes.size(); i++) {
						if(dishName.equals(dishes.get(i))) {
							dishes.remove(i);
							notify(); // COOK을 깨움.
							return;
						}
					}
					
				try {
					System.out.println(name + " is waiting");
					wait();
					Thread.sleep(500);
				} catch(InterruptedException e) {}
			}	
		}
	}
	
	public int dishNum() { return dishNames.length; }
}




public class synchronizedEx2 {
	public static void main(String[] args) throws Exception {
		Table table1 = new Table(); // 여러 스레드가 공유하는 객체
		
		new Thread(new Cook(table1), "COOK").start();
		new Thread(new Customer(table1, "donut"), "CUST1").start();
		new Thread(new Customer(table1, "burger"), "CUST2").start();
		
		Thread.sleep(5000);
		System.exit(0);
	}
}
//	[donut]
//	CUST1 eat a donut
//	CUST2 is waiting.
//	CUST1 is waiting.
//	[burger]
//	CUST2 eat a burger
//	CUST1 is waiting.
//	CUST2 is waiting.
//	[donut]
//	CUST1 eat a donut
//	CUST2 is waiting.
//	CUST1 is waiting.
//	[donut]
//	CUST2 is waiting
//	[donut, donut]
//	CUST1 eat a donut
//	CUST2 is waiting
//	CUST1 eat a donut
//	[burger]
//	CUST2 eat a burger
//	[donut]
//	CUST1 eat a donut
//	CUST1 is waiting.
//	CUST2 is waiting.
//	[donut]
//	CUST1 eat a donut



