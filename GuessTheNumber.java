import java.util.Scanner;//Get user input
import java.util.Random;//create a random number
public class GuessTheNumber {
	private Scanner userInput = new Scanner(System.in);//get user input
	private Random randNum = new Random();
	public void play() {
		int magicNumber = 1 + randNum.nextInt(10);//creates a random number between 1 and 10
		int guess = askForGuess();
		int counter = 1;//counts how many time the guesses has occurred
		while (guess != magicNumber) {
			if(guess > magicNumber) {
				System.out.print("Your guess is too high!");
			}
			else if(guess < magicNumber) {
				System.out.print("Your guess is too low!");
			}
			System.out.print("\n");
			guess = askForGuess();
			counter++;
		}
		System.out.printf("You guessed correctly in %d guesses!!!!", counter);
	}
	
	private int askForGuess() {
	
		int userGuess = 0;
		
		System.out.print("Enter your guess: ");
		userGuess = userInput.nextInt();
			
		return userGuess;
	}
}
