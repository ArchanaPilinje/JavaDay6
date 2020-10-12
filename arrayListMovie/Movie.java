package arrayListMovie;
import java.util.ArrayList;
public class Movie {
	private String movieName;
	private String year;
	private ArrayList<Actor> act;
	
	
	public Movie() {
		
	}

	public Movie(String movieName, String year, ArrayList<Actor> act) {
		super();
		this.movieName = movieName;
		this.year = year;
		this.act = act;
	}
	
	

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public ArrayList<Actor> getAct() {
		return act;
	}

	public void setAct(ArrayList<Actor> a) {
		this.act = a;
	}
	
	public void printMovie() {
		System.out.println("**********************");
		System.out.println("Movie Name:" + this.movieName);
		System.out.println("Year of Release:" + this.year);
		for (Actor a : act) {
			a.printActor();
		}
		System.out.println("**********************");

	}
	
}
