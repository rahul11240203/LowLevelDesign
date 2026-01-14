package vending.machine.state.design.pattern;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {

	VendingMachineState idleState = new IdleState();
	VendingMachineState selectedItemState = new SelectedItemState();
	VendingMachineState paymentState = new PaymentState();
	VendingMachineState disbursmentState = new DisbursmentState();
	
	VendingMachineState currentState=idleState;
	
	List<Item> selectedItem=new ArrayList<>();
	
	
	
	public int getTotalAmount() {
		return selectedItem.stream().mapToInt(Item::getPrice).sum();
	}
	
	public synchronized void selectItem(Item item){
		currentState.selectItem(this, item);
	}
	
	public synchronized void makePayment() {
		currentState.makePayment(this);
	}
	
	public synchronized void despenseItem() {
		currentState.dispenseItem(this);
	}
	
	
	/**
	 * 
	 * @return the currentState
	 */
	public VendingMachineState getCurrentState() {
		return currentState;
	}

	/**
	 * @param currentState the currentState to set
	 */
	public void setCurrentState(VendingMachineState currentState) {
		this.currentState = currentState;
	}

	/**
	 * @return the selectedItem
	 */
	public List<Item> getSelectedItem() {
		return selectedItem;
	}

	/**
	 * @param selectedItem the selectedItem to set
	 */
	public void setSelectedItem(List<Item> selectedItem) {
		this.selectedItem = selectedItem;
	}

	/**
	 * @return the idleState
	 */
	public VendingMachineState getIdleState() {
		return idleState;
	}

	/**
	 * @param idleState the idleState to set
	 */
	public void setIdleState(VendingMachineState idleState) {
		this.idleState = idleState;
	}

	/**
	 * @return the selectedItemState
	 */
	public VendingMachineState getSelectedItemState() {
		return selectedItemState;
	}

	/**
	 * @param selectedItemState the selectedItemState to set
	 */
	public void setSelectedItemState(VendingMachineState selectedItemState) {
		this.selectedItemState = selectedItemState;
	}

	/**
	 * @return the paymentState
	 */
	public VendingMachineState getPaymentState() {
		return paymentState;
	}

	/**
	 * @param paymentState the paymentState to set
	 */
	public void setPaymentState(VendingMachineState paymentState) {
		this.paymentState = paymentState;
	}

	/**
	 * @return the disbursmentState
	 */
	public VendingMachineState getDisbursmentState() {
		return disbursmentState;
	}

	/**
	 * @param disbursmentState the disbursmentState to set
	 */
	public void setDisbursmentState(VendingMachineState disbursmentState) {
		this.disbursmentState = disbursmentState;
	}
	
	
	
	
	
}
