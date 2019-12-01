package models;

public enum TypeSpecie {
	CACHAMA("CACHAMA"),
	TRUCHA("TRUCHA"),
	TILAPIA_NEGRA("TILAPIA NEGRA"),
	TILAPIA_O_MOJARRA_ROJA("TILAPIA O MOJARRA ROJA"),
	CARPA("CARPA"),
	BOCACHICO("BOCACHICO"),
	TILAPIA_O_MOJARRA("TILAPIA O MOJARRA"),
	RTRUCHA("RTRUCHA"),
	UCACHAMA("UCACHAMA"),
	UTILAPIA_NEGRA("UTILAPIA NEGRA"),
	UTILAPIA_O_MOJARRA("UTILAPIA O MOJARRA");
	private String name;
	
	private TypeSpecie(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
