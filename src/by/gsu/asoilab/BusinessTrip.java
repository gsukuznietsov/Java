package by.gsu.asoilab;

public class BusinessTrip {
	private static final int DAILY_RATE = 600;
	private String account;
	private int expenses;
	private int days;
	
	public BusinessTrip() {
	}
	
	public BusinessTrip(String account, int expenses, int days) {
		this.account = account;
		this.expenses = expenses;
		this.days = days;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public int getExpenses() {
		return expenses;
	}

	public void setExpenses(int expenses) {
		this.expenses = expenses;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}
		
	public static int getDailyRate() {
		return DAILY_RATE;
	}

	public int getTotal(){
		return expenses + DAILY_RATE * days;
	}
	
	public void show(){
		System.out.println("Rate: " + DAILY_RATE+ "\n" + "Account: " + account + "\n" 
							+ "Transport expenses: " + expenses + "\n" + "Days: " + days + "\n" + "Total: " + getTotal() + "\n");
	}
	
}
