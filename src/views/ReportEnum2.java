package views;


public enum ReportEnum2 {
	JSON("JSON"),
	WEB("WEB");
	
	private String name;
	
	private ReportEnum2(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
}
