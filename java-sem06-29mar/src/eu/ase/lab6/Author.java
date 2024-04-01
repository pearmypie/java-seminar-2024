package eu.ase.lab6;

public class Author {
	
	private int birthYear;
	
	private String name;
	
	private String country;
	
	public Author(int birthYear, String name, String country) {
		super();
		this.birthYear = birthYear;
		this.name = name;
		this.country = country;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
}
