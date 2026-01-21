package splitwise.application;

public class ExactSplits extends Splits {

	public ExactSplits(User user) {
		super(user);
	}

	@Override
	public void calculateAmount(double amount, int memberCount) {
		this.amount=amount;
	}

}
