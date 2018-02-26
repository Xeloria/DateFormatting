
public class Date {

	private String yyyy;
	private String mm;
	private String dd;
	
	public Date(String yyyy, String mm, String dd) {
		this.yyyy = yyyy;
		this.mm = mm;
		this.dd = dd;
	}

	public String year() {
		return yyyy;
	}

	public String month() {
		return mm;
	}

	public String day() {
		return dd;
	}
	
	
	
}
