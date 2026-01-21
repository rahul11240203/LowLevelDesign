package splitwise.application;

abstract class Splits {
	protected User user;
	protected double amount;
	
	public Splits(User user) {
		this.user=user;
	}

	public abstract void calculateAmount(double amount, int memberCount);
	
	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * @return the amount
	 */
	public double getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
}
