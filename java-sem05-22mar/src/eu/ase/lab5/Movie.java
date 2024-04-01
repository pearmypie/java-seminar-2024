package eu.ase.lab5;

public class Movie implements Cloneable {
	private int year;
	private String title;
	private float rating;
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	public Movie(int year, String title, float rating) {
		super();
		this.year = year;
		this.title = title;
		this.rating = rating;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Movie clone = (Movie)super.clone();
		
		clone.year = this.getYear();
		clone.title = this.getTitle();
		clone.rating = this.getRating();
		
		return clone;
	}
	@Override
	public String toString() {
		return String.format("The movie %s from %d has a rating of %.1f", 
						this.getTitle(), 
						this.getYear(), 
						this.getRating()
		);
	}
//	@Override
//	public int compareTo(Movie movieToCompare) {
//		//  0 -> obj de referinta e egal
//		//  1 -> obj de referinta e mai mare
//		// -1 -> obj de referinta e mai mic
//		
//		if(this.getRating() == movieToCompare.getRating()) {
//			return 0;
//		}
//		if(this.getRating() > movieToCompare.getRating()) {
//			return 1;
//		} else {
//			return -1;
//		}
//	}
	@Override
	public int hashCode() {
		int hash = 7; // in general numere prime
		hash = 31 * hash + this.getYear();
		hash = 31 * hash + this.getTitle().hashCode();
		hash = 31 * hash + (int)this.getRating();
		
		return hash;
	}	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Movie) {
			Movie movie = (Movie) obj;
			return 
				this.getYear() == movie.getYear() && 
				this.getTitle().equals(movie.getTitle()) && 
				this.getRating() == movie.getRating()
				;
		} else {
			return false;
		}
	}	
}
