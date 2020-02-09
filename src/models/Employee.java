package models;

public class Employee {
	
    private long id;
    private long year;
    private String municipality;
    private String specie;
    private long seeded;
    private long haversted;
    private long weight;
    private long production;
    private long price;
    
	
    public Employee(long year, String municipality, String specie, long seeded, long harvested, long weight,long production, long price) {
	
		this.year = year;
		this.municipality = municipality;
		this.specie = specie;
		this.seeded = seeded;
		this.haversted = harvested;
		this.weight = weight;
		this.production = production;
		this.price = price;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getYear() {
		return year;
	}


	public void setYear(long year) {
		this.year = year;
	}

	public String getMunicipality() {
		return municipality;
	}

	public void setMunicipality(String municipality) {
		this.municipality = municipality;
	}

	public String getSpecie() {
		return specie;
	}

	public void setSpecie(String specie) {
		this.specie = specie;
	} 

	public long getSeeded() {
		return seeded;
	}

	public void setSeeded(long seeded) {
		this.seeded = seeded;
	}

	public long getHaversted() {
		return haversted;
	}

	public void setHaversted(long haversted) {
		this.haversted = haversted;
	}

	public long getWeight() {
		return weight;
	}

	public void setWeight(long weight) {
		this.weight = weight;
	}

	public long getProduction() {
		return production;
	}

	public void setProduction(long production) {
		this.production = production;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public Object[] toObjectVector() {
		return new Object[] {this.id, this.year, this.municipality, this.specie, this.seeded, this.haversted, this.weight, this.production, this.price};
    }	
}
