import java.util.Random;

class B2GuessingGame extends ConsoleProgram {

  /**
  * Generate a secret number (an integer between 1 and 100), for your friend to guess
  * If they guess too high, print: "too high, guess again." If they guess too low, print: "too low, guess again"
  * If they guess the number, let the program stop and print "congratulations"
  * If they've guessed incorrectly after 5 attempts, print "Nice Try"
  * @author:
  */
  
  public void run() {
    Random number = new Random();

    // Declare variables
    int guess = readInt ("Guess a number from 1 to 100: ");
    int answer = number.nextInt(1, 100);
    
    // Starting guess
    int counter = 1;

    // Loop until the user guesses
    while (guess != answer && counter < 5);

    // If they guess too high, print: "too high, guess again."
    if (guess > answer)
    {
      System.out.println ("Too high, guess again.");
      guess = readInt ("Guess a number from 1 to 100: ");
      counter ++;
    }

    // If they guess too low, print: "too low, guess again"
    else if (guess < answer)
    {
      System.out.println ("Too low, guess again.");
      guess = readInt ("Guess a number from 1 to 100: ");
      counter ++;
    }

    // If they've guessed incorrectly after 5 attempts, print "Nice Try"
    if (guess != answer && counter ==5)
    {
      System.out.println ("Nice try.");
    }

    // If they guess the number, let the program stop and print "congratulations"
    else if (guess == answer)
    {
      System.out.println ("Congratulations!");
    }
  }
}
