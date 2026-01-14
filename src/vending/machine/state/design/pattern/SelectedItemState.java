package vending.machine.state.design.pattern;

public class SelectedItemState implements VendingMachineState {

	@Override
	public void selectItem(VendingMachine machineState,Item item) {
		machineState.getSelectedItem().add(item);
		machineState.setCurrentState(machineState.getPaymentState());
		System.out.println("ITEM ADDED");
	}

	@Override
	public void makePayment(VendingMachine machineState) {
		System.out.println("Payment is in process");
		machineState.setCurrentState(machineState.getPaymentState());
		
	}

	@Override
	public void dispenseItem(VendingMachine machineState) {
		System.out.println("Please make payment first");
	}

}
