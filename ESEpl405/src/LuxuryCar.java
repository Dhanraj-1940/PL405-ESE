
public class LuxuryCar implements Car{

	private String info;
	@Override
	public String details() {
		info = "this is a Luxury design car";
		return info;
	}
}
