package vending.machine.state.design.pattern;

public class IdleState implements VendingMachineState {

	@Override
	public void selectItem(VendingMachine machineState, Item item) {
		 machineState.getSelectedItem().add(item);
		 machineState.setCurrentState(machineState.getSelectedItemState());
		 System.out.println("ITEM ADDED");
	}

	@Override
	public void makePayment(VendingMachine machineState) {
		System.out.println("Please selecte Item first");
	}

	@Override
	public void dispenseItem(VendingMachine machineState) {
		System.out.println("Cart is empty, Can't despense");
	}

}
