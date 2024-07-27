import java.util.Scanner;//Get user input

public class GuessTheNumberTest {

	public static void main(String[] args) {
		GuessTheNumber guess = new GuessTheNumber();
		Scanner userInput = new Scanner(System.in);
		int stopGame = 0;//create varible to either stop or continue game
		do {
			guess.play();//plays the game
			System.out.print("Enter -1 to stop game, or 1 to continue: ");
			stopGame = userInput.nextInt();
		}while(stopGame != -1);

	}

}
