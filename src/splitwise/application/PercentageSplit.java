package splitwise.application;

public class PercentageSplit extends Splits {
	private double percent;
	
	
	public PercentageSplit(User user, double percent) {
		super(user);
		this.percent=percent;
	}

	@Override
	public void calculateAmount(double amount, int memberCount) {
		this.amount = amount*percent/100.0;
	}

}
