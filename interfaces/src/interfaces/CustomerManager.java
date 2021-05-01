package interfaces;

public class CustomerManager {
	
	private Logger[] loggers;
	
	public CustomerManager(Logger[] loggers) {
		
		this.loggers = loggers;
	}
	
	
	public void add(Customer customer) {
		System.out.println("Müþteri eklendi " + customer.getFirstname());
		
		for(Logger logger : loggers) {
			logger.Log(customer.getFirstname());
		}
		
		
	}
	
		public void delete(Customer customer) {
		System.out.println("Müþteri silindi " + customer.getFirstname());
		
		for(Logger logger : loggers) {
			logger.Log(customer.getFirstname());
		}
		
	}
	
}
