import java.util.Scanner;

public class MovieDriverTask1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Movie movie=new Movie();
		System.out.println("Enter the title of the movie: ");
		String inputS = input.nextLine();
		movie.setTitle(inputS);
		System.out.println("Enter the rating of the movie: ");
		inputS = input.nextLine();
		movie.setRating(inputS);
		System.out.println("Enter the number of tickets sold for this movie: ");
		int inputI = input.nextInt();
		movie.setSoldTickets(inputI);
		
		System.out.print(movie.toString());

	}

}
