package views;

import general.HandlerLanguage;

public enum ReportEnum {
	AVERAGE_SPECIE_PRICE_IN_BOYAC(HandlerLanguage.languageProperties.getProperty(Constants.AVERAGE_PRICE)),
	PERCERTAGE_OF_CULTIVATE_SPECIES(HandlerLanguage.languageProperties.getProperty(Constants.PERCENTAGE_SPECIE_SEEDED)),
	AVERAGE_SPECIE_PRODUCTION_IN_BOYACA(HandlerLanguage.languageProperties.getProperty(Constants.AVERAGE_PRODUCTION_BY_SPECIE)),	
	PERCERTAGE_SPECIE_PRODUCTION_IN_BOYACA(HandlerLanguage.languageProperties.getProperty(Constants.PERCENTAGE_PRODUCTION_BY_SPECIE)),
	PONDS_BY_YEAR(HandlerLanguage.languageProperties.getProperty(Constants.PONDS_BY_YEAR)),
	AVERAGE_WEIGHT_SPECIES(HandlerLanguage.languageProperties.getProperty(Constants.AVERAGE_WEIGHT_BY_SPECIE)),
	AVERAGE_HARVESTED(HandlerLanguage.languageProperties.getProperty(Constants.AVERAGE_HARVESTED)),
	HARVESTED_PUERTO_BOYACA(HandlerLanguage.languageProperties.getProperty(Constants.HARVESTED_IN_PUERTO_BOYCA)),
	HARVESTED_TOTAL(HandlerLanguage.languageProperties.getProperty(Constants.TOTAL_HARVESTED)),
	PERCERTAGE_PRODUCTION_FOR_MUNICIPALITY(HandlerLanguage.languageProperties.getProperty(Constants.PERCENTAGE_PRODUCTION_BY_MUNICIPALITY));
	
	private String name;
	
	private ReportEnum(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
