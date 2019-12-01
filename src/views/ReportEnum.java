package views;

public enum ReportEnum {
	AVERAGE_SPECIE_PRICE_IN_BOYAC("Promedio de precio por especie en boyaca"),
	PERCERTAGE_OF_CULTIVATE_SPECIES("Porcentaje de especies cultivadas en boyaca");
	private String name;
	
	private ReportEnum(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
