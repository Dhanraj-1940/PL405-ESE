
public class NotAvailable implements Car{

	private String info;
	
	@Override
	public String details() {
		info = "No such car design available";
		return info;
	}

}
