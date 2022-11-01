package in.bushansirgur.expense_tracker.service;

import java.util.List;

import in.bushansirgur.expense_tracker.model.Expense;

public interface ExpenseService {
	
	List<Expense> findAll();
	
	void save (Expense expense);
	
	Expense findById(Long id);
	
	void delete(Long id);

}
