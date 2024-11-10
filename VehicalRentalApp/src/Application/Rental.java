package Application;


	public class Rental {
	    private Vehicle vehicle;
	    private Customer customer;
	    private int days;

	    public Rental(Vehicle car, Customer customer, int days) {
	        this.vehicle = car;
	        this.customer = customer;
	        this.days = days;
	    }

	    public Vehicle getCar() {
	        return vehicle;
	    }

	    public Customer getCustomer() {
	        return customer;
	    }

	    public int getDays() {
	        return days;
	    }

	    public double getRentalAmount() {
	        return vehicle.calculatePrice(days);
	    }
	


}
