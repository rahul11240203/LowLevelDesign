package splitwise.application;

public class EqualSplit extends Splits {

	
	public EqualSplit(User user) {
		super(user);
	}

	@Override
	public void calculateAmount(double amount, int memberCount) {
		this.amount=amount/memberCount;
	}

}
