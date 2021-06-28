import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Available designs: Sports, Luxury, Vintage");
		System.out.println("Please enter the required car design");
		String design = in.nextLine();
		CarFactory cf = new CarFactory();
		Car car = cf.getInstance(design);
		System.out.println(car.details());
	}

}
