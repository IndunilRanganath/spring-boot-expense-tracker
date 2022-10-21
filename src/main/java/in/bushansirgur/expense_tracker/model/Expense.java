package in.bushansirgur.expense_tracker.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "tbl_expenses")

@Setter
@Getter
@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor



public class Expense {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="discription")
	private String expensename;
	
	private BigDecimal amount;
	
	private String note;
	
	private Long createdAt;

}
