package vending.machine.state.design.pattern;

import java.util.ArrayList;

public class DisbursmentState implements VendingMachineState {

	@Override
	public void selectItem(VendingMachine machineState, Item item) {
		System.out.println("CAN'T ADD ITEM IN DESPENSE STATE");
	}

	@Override
	public void makePayment(VendingMachine machineState) {
		System.out.println("PAYMENT COMPLETED");
	}

	@Override
	public void dispenseItem(VendingMachine machineState) {
		System.out.println("please collect items");
		machineState.setCurrentState(machineState.getIdleState());
		machineState.setSelectedItem(new ArrayList<>());
	}

}
