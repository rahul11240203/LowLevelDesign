package splitwise.application;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BalanceService {
	
	private Map<User, Map<User, Double>> balance = new HashMap<>();
	
	
	public void updateBalance(Expense expense) {
		User paidBy = expense.getPaidBy();

		List<Splits>splitList = expense.getSplits();
		
		for(Splits split : splitList) {
			double amountUser = split.getAmount();
			User user = split.getUser();
			
			if(paidBy.equals(user)) {
				continue;
			}
			
			Map<User, Double> userBalance = balance.get(paidBy);
			if(userBalance==null) {
				userBalance=new HashMap<>();
				balance.put(paidBy, userBalance);
			}
			
			double curAmount = userBalance.getOrDefault(user, 0.0);
			userBalance.put(user, curAmount+amountUser);
		}
		
	}
	
	public void showBalance() {
		
		if(balance==null) { 
			System.out.println("NO BALANCE");
			return;
		}
		
		for(User user : balance.keySet()) {		
			
			for(Map.Entry<User, Double>entry :  balance.get(user).entrySet()) {
				
				System.out.println(user.getName() + " Owes to >>" + entry.getKey().getName() + " WITH >>" + entry.getValue() );
			}
		}
		
	}
	
	
}
