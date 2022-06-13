package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Installment {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private Date dueDate;
	private Double ammount;
	
	public Installment() {
	}

	public Installment(Date dueDate, Double ammount) {
		super();
		this.dueDate = dueDate;
		this.ammount = ammount;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public Double getAmmount() {
		return ammount;
	}

	public void setAmmount(Double ammount) {
		this.ammount = ammount;
	}

	@Override
	public String toString() {
		return sdf.format(dueDate) + " - " + String.format("%.2f", ammount) ;
	}
	
	
}
