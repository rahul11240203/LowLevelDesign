package vending.machine.state.design.pattern;

public class PaymentState implements VendingMachineState {

	@Override
	public void selectItem(VendingMachine machineState, Item item) {
		System.out.println("PAYMENT IN PROCESS, CAN'T ADD");
	}

	@Override
	public void makePayment(VendingMachine machineState) {
		System.out.println("PAYMENT SUCCESSFULL");
		machineState.setCurrentState(machineState.getDisbursmentState());
	}

	@Override
	public void dispenseItem(VendingMachine machineState) {
		System.out.println("PAYMENT REQUIRED!");
	}

}
