package views;

public enum ReportEnum2 {
	GRAFIC_OF_CULTIVATE_SPECIES("Grafica de especies cultivadas en boyaca"),
	GRAFIC_OF_PRICE_SPECIES("Grafica de precios promedio de las especies");
	private String name;
	
	private ReportEnum2(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
