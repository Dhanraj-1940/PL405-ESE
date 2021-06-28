
public class CarFactory {

	public Car getInstance(String car) {
		if(car.equalsIgnoreCase("sports")) {
			return new SportsCar();
		}
		else if(car.equalsIgnoreCase("luxury")) {
			return new LuxuryCar();
		}
		else if(car.equalsIgnoreCase("vintage")) {
			return new VintageCar();
		}
		else {
			System.out.println("This car variant is not available");
			return new NotAvailable();
		}
	}
}
