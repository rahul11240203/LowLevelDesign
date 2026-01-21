package splitwise.application;

import java.util.Arrays;
import java.util.List;

public class SplitwiseApplication {
	public static void main(String args[]) {
		User rahul=new User("123", "RAHUL SAHU", "8173014504");
		User anjali=new User("124", "ANJALI SAHU", "9278131468");
		User user1 = new User("125", "USER UNKNOWN", "8104631468");
		
		Group group1=new Group("group123", "MANALI TRIP");
		
		group1.addMember(rahul);
		group1.addMember(anjali);
		group1.addMember(user1);
		
		List<Splits> splits = Arrays.asList(
				new EqualSplit(rahul),
				new EqualSplit(anjali),
				new EqualSplit(user1)
				);
		
		List<Splits> splitMilk = Arrays.asList(new ExactSplits(rahul), new ExactSplits(anjali));
		
		Expense grocery=new Expense("exp123", SplitType.EQUAL, user1, 100.0, splits);
		Expense milk = new Expense("exp124", SplitType.EQUAL, rahul, 30.0, splitMilk);
		
		
		BalanceService balanceService=new BalanceService();
		ExpenseService expenseService = new ExpenseService(balanceService);
		
		expenseService.addExpense(grocery);
		
		
		balanceService.showBalance();
		
		
		expenseService.addExpense(milk);
		balanceService.showBalance();
		
		
	
	}
}
