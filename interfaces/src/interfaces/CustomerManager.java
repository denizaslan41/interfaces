package interfaces;

public class CustomerManager {
	
	private Logger[] loggers;
	
	public CustomerManager(Logger[] loggers) {
		
		this.loggers = loggers;
	}
	
	public void add(Customer customer) {
		System.out.println("Müþteri eklendi " + customer.getFirstname());		
		Utils.runLoggers(loggers, customer.getFirstname());		
	}
	
		
		public void delete(Customer customer) {
		System.out.println("Müþteri silindi " + customer.getFirstname());		
		Utils.runLoggers(loggers, customer.getLastName());		
	}	
}
