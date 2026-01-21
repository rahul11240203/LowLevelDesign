package splitwise.application;

import java.util.List;

public class Expense {
	private String id;
	private SplitType expenseType;
	private User paidBy;
	private double amount;
	List<Splits> splits;
	
	public Expense(String id, SplitType expenseType, User paidBy, double amount, List<Splits> splits) {
		super();
		this.id = id;
		this.expenseType = expenseType;
		this.paidBy = paidBy;
		this.amount = amount;
		this.splits = splits;
	}

	
	
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the expenseType
	 */
	public SplitType getExpenseType() {
		return expenseType;
	}

	/**
	 * @param expenseType the expenseType to set
	 */
	public void setExpenseType(SplitType expenseType) {
		this.expenseType = expenseType;
	}

	/**
	 * @return the paidBy
	 */
	public User getPaidBy() {
		return paidBy;
	}

	/**
	 * @param paidBy the paidBy to set
	 */
	public void setPaidBy(User paidBy) {
		this.paidBy = paidBy;
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

	/**
	 * @return the splits
	 */
	public List<Splits> getSplits() {
		return splits;
	}

	/**
	 * @param splits the splits to set
	 */
	public void setSplits(List<Splits> splits) {
		this.splits = splits;
	}
}
