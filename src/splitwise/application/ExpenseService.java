package splitwise.application;

import java.util.List;

public class ExpenseService {

	BalanceService balanceService;
	
	ExpenseService(BalanceService balanceService) {
		this.balanceService=balanceService;
	}
	
	public void addExpense(Expense expense) {
		validateExpense(expense);
		splitAmount(expense);
		balanceService.updateBalance(expense);
	}

	private void splitAmount(Expense expense) {
		List<Splits> split = expense.getSplits();
		double amount = expense.getAmount();
		for(Splits splt : split) {
			splt.calculateAmount(amount, split.size());
		}
		
	}

	private boolean validateExpense(Expense expense) {
		if(expense.getAmount()<0) {
			System.out.println("INVALID EXPENSE");
			return false;
		}
		System.out.println("VALID EXPENSE");
		return true;
	}
	
}
