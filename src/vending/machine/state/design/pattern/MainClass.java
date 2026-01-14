package vending.machine.state.design.pattern;

public class MainClass {
	public static void main(String[] args) {
		VendingMachine vm = new VendingMachine();
		
		Item item1=new Item("coke", 10);
		Item item2=new Item("Chocolate", 20);
	
		
		Runnable user1 = () ->{
			vm.selectItem(item1);
			vm.despenseItem();
		};
		
		Runnable user2 = () ->{
			vm.selectItem(item2);
			vm.makePayment();
			vm.despenseItem();
		};
		
		Thread t1 = new Thread(user1, "thread1");
		Thread t2 = new Thread(user2, "thread2");
		
		t1.start();
		t2.start();
				
				
//		vm.getCurrentState().selectItem(vm, item1);
//		vm.getCurrentState().selectItem(vm, item2);
//		
//		vm.getCurrentState().makePayment(vm);
//	
//		vm.getCurrentState().dispenseItem(vm);
		
		
		
	}
}
