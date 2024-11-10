package Application;


import java.util.Scanner;

	public class Payment {
	    private double amount;
	    private String paymentMethod;

	    public Payment(double amount) {
	        this.amount = amount;
	    }

	    public void makePayment() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Select Payment Method: ");
	        System.out.println("1. Cash");
	        System.out.println("2. Online Payment");

	        int choice = scanner.nextInt();
	        scanner.nextLine(); 
	        switch (choice) {
	            case 1:
	                paymentMethod = "Cash";
	                System.out.println("Payment of Rs." + amount + " made by Cash.");
	                break;
	            case 2:
	                paymentMethod = "Online Payment";
	                System.out.println("Choose Online Payment Method:");
	                System.out.println("1. UPI");
	                System.out.println("2. Credit Card");
	                System.out.println("3. Debit Card");
	                
	                int onlineChoice = scanner.nextInt();
	                scanner.nextLine(); 
	                switch (onlineChoice) {
	                    case 1:
	                        System.out.println("You selected UPI. Enter UPI ID:");
	                        String upiId = scanner.nextLine();
	                        System.out.println("Payment of Rs." + amount + " made via UPI ");
	                        break;
	                    case 2:
	                        System.out.println("You selected Credit Card. Enter Card Number:");
	                        String creditCardNumber = scanner.nextLine();
	                        System.out.println("Payment of Rs." + amount + " made via Credit Card.");
	                        break;
	                    case 3:
	                        System.out.println("You selected Debit Card. Enter Card Number:");
	                        String debitCardNumber = scanner.nextLine();
	                        System.out.println("Payment of Rs." + amount + " made via Debit Card.");
	                        break;
	                    default:
	                        System.out.println("Invalid option.");
	                        break;
	                }
	                break;
	            default:
	                System.out.println("Invalid option.");
	                break;
	        }
	    }
	


}
