package in.bushansirgur.expense_tracker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.bushansirgur.expense_tracker.model.Expense;
import in.bushansirgur.expense_tracker.repository.ExpenseRepository;

@Service
public class ExpenseServiceimpl implements ExpenseService {
	
	@Autowired
	ExpenseRepository expenseRepository;
	
	@Override 
	public List<Expense> findAll() {
		// TODO Auto-generated method stub
		return expenseRepository.findAll();
	}

	@Override
	public void save(Expense expense) {
		expense.setCreatedAt(System.currentTimeMillis());
		expenseRepository.save(expense);
		
	}

}
