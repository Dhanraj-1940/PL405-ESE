
public class VintageCar implements Car{
	
	private String info;

	@Override
	public String details() {
		info = "this is a Vintage design car";
		return info;
	};
	
}
