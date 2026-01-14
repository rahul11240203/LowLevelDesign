package vending.machine.state.design.pattern;

public interface VendingMachineState {
	public void selectItem(VendingMachine machineState, Item item);
	public void makePayment(VendingMachine machineState);
	public void dispenseItem(VendingMachine machineState);
}
