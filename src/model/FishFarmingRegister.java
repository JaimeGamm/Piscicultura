package model;

import java.time.LocalTime;


public class FishFarmingRegister {
//	private LocalDate presentDate = LocalDate.now(); 
	private long id;
	private String firstName;
	private String secondName;
	private String lastName;
	private String gender;
	private LocalTime totalTravelTime;
	private long price,harvestedAnimals,animalsWeight,seededAnimals,estimatedProduction;




	public FishFarmingRegister(long id, String municipalityName,String speciesName,long seededAnimals, long harvestedAnimals, long animalsWeight, long estimatedProduction, long price) {
		this.id =id;
		this.firstName =municipalityName;
		this.lastName =speciesName;
		this.seededAnimals=seededAnimals;
		this.harvestedAnimals=harvestedAnimals;
		this.animalsWeight =animalsWeight;
		this.estimatedProduction=estimatedProduction;
		this.price=price;
	}
	public FishFarmingRegister() {
		
	}

	public Object[] toObjectVector() {
		return new Object[] { id,firstName,harvestedAnimals,lastName,seededAnimals,harvestedAnimals,animalsWeight,estimatedProduction,price};
	}
	
	public long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getAnimalsWeight() {
		return animalsWeight;
	}


	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}


	public LocalTime getTotalTravelTime() {
		return totalTravelTime;
	}

	public void setTotalTravelTime(LocalTime totalTravelTime) {
		this.totalTravelTime = totalTravelTime;
	}
//	public String toString() { 
//		return "id: "+getId()+ " nombre: "+ getFirstName()+" "+getBirthDate().toString();
//	}
	public static void main(String[] args) {
		//c.setBirthDate(c.toDate("12/11/2000"));
		//System.out.println(c.toDate("12/11/1968").toString());
				//System.out.println( c.getAge());
				//c.calculateTime("01:23:54");
	}
	public long getPrice() {
		return price;
	}
	public void setTeamId(int teamId) {
		this.price = teamId;
	}
	


}
