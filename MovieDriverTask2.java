import java.util.Scanner;

public class MovieDriverTask2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Movie movie=new Movie();
		char answer = 'y';
		String inputS;
		do {
			System.out.println("Enter the title of the movie: ");
			movie.setTitle(input.nextLine());
			//input.nextLine();
			System.out.println("Enter the rating of the movie: ");
			movie.setRating(input.nextLine());
			
			System.out.println("Enter the number of tickets sold for this movie: ");
			movie.setSoldTickets(input.nextInt());
			input.nextLine();
			System.out.println(movie.toString());
			
			System.out.print("Want to enter another movie? (Y/N): ");
			inputS = input.nextLine();
			answer = inputS.charAt(0);
		}while(answer =='y'|| answer=='Y');
		

	}

}
