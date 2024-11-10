package Application;


		public class Main {
		    public static void main(String[] args) {
		        RentalService rentalSystem = new RentalService();

		        Vehicle car1 = new Vehicle("C001", "Toyota", "Camry", 60.0);
		        Vehicle car2 = new Vehicle("C002", "Honda", "Accord", 70.0);
		        Vehicle car3 = new Vehicle("C003", "Mahindra", "Thar", 150.0);
		        rentalSystem.addCar(car1);
		        rentalSystem.addCar(car2);
		        rentalSystem.addCar(car3);

		        rentalSystem.menu();
		    }
		}


	


