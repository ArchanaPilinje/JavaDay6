package arrayListMovie;

import java.util.Scanner;
import java.util.ArrayList;

public class MovieDetails {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of movies");
		int nM = sc.nextInt();
		sc.nextLine();
		int flag;
		Movie[] movies = new Movie[nM];

		for (int i = 0; i < nM; i++) {
			Movie m = new Movie();
			System.out.println("Enter the Movie Name and Year of Release of Movie" + (i + 1));

			m.setMovieName(sc.nextLine());

			m.setYear(sc.nextLine());
			flag = 0;
			ArrayList<Actor> act = new ArrayList<>();
			do {

				
				Actor temp = new Actor();
				System.out.println("Enter the actor name and actor's role name respectively");
				temp.setActorName(sc.nextLine());
				temp.setActorRoleName(sc.nextLine());
				act.add(temp);
				System.out.println("1.To Add Actors 2.Done with the Actors");
				flag=sc.nextInt();
				sc.nextLine();
			} while (flag == 1);
			m.setAct(act);
			movies[i]=m;
		}
		
		for(Movie m:movies) {
			m.printMovie();
		}
		

	}

}
