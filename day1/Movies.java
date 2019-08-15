package day1;

public class Movies {
	private String name;
	private double rating;
	public void Info() {
	System.out.println("Movie name: " +name+ "\t Movie rating: " +rating);	
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setRating(double rating) {
		this.rating=rating;
	}
	
	
	
}

class Genre extends Movies {
	public void MovieGenre() {
		Horror horror = new Horror();
		horror.scary();
		}
	}

class Horror {
	public void scary() {
		System.out.println("Horror is scary");
		
	}
}

class ReDemo {
	public void main(String[] args) {
		// TODO Auto-generated method stub
		Movies movie = new Movies();
		movie.setName("Toy Story");
		movie.setRating(4.5);
		movie.Info();
		movie.MovieGenre();
	}
}

