package views;

public enum ReportEnum {
	AVERAGE_SPECIE_PRICE_IN_BOYAC("Promedio de precio por especie en boyaca"),
	PERCERTAGE_OF_CULTIVATE_SPECIES("Porcentaje de especies cultivadas en boyaca"),
	AVERAGE_SPECIE_PRODUCTION_IN_BOYACA("Promedio de producion por especie en boyaca"),	
	PERCERTAGE_SPECIE_PRODUCTION_IN_BOYACA("Porcentaje de porducion por especie en boyaca"),
	PERCERTAGE_PRODUCTION_FOR_MUNICIPALITY("Porcentaje de producion en psicultura por municipio");
	
	private String name;
	
	private ReportEnum(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
