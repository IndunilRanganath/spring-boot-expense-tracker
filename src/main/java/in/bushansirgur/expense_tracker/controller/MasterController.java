package in.bushansirgur.expense_tracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import in.bushansirgur.expense_tracker.model.Expense;
import in.bushansirgur.expense_tracker.service.ExpenseService;

@Controller
public class MasterController {
	
	@Autowired
	ExpenseService expenseService;
	@ResponseBody
	@RequestMapping("/")
	public ModelAndView home() {
		ModelAndView mav = new ModelAndView("home");
		mav.addObject("message" , "List of Expenses");
		List<Expense> expense = expenseService.findAll();
		System.out.println(expense);
		return mav;
	}
}
