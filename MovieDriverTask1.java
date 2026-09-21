import java.util.Scanner;
/** This program reads input from the keyboard about a movie and uses Movie class object to store these values.
 */
public class MovieDriverTask1 {

	public static void main(String[] args) {
		//Objects used in the program
		Scanner input = new Scanner(System.in);
		Movie movie=new Movie();
		
		//Reads the title of the movie and sets the title field in movie to that value
		System.out.println("Enter the title of the movie: ");
		movie.setTitle(input.nextLine());
		//Reads the rating of the movie and sets the rating field in movie to that value
		System.out.println("Enter the rating of the movie: ");
		movie.setRating(input.nextLine());
		//Reads the number of tickets sold and sets the soldTickers field in movie to that value
		System.out.println("Enter the number of tickets sold for this movie: ");
		movie.setSoldTickets(input.nextInt());
		//Displays the information about the movie
		System.out.print(movie.toString());

	}

}
