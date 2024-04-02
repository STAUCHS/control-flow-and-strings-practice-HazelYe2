class B1DiceGame extends ConsoleProgram {

  /**
  * Write a program that lets you simulate the rolling of 100 pairs of dice. For each roll, 
  * if the pair adds up to 2, print "snake eyes!"
  * If the pair adds up to 7, print "lucky seven"
  * if the pair adds up to any other sum, do not print out anything
  * @author: H. Ye
  */
  
  public void run() {
    int rolls = 100;
    Random roll = new Random();

    // Declare variables
    int dieOne;
    int dieTwo;
    int total = dieOne + dieTwo;

    for (int counter = 0; counter < rolls; counter++);
    {
      dieOne = roll.nextInt (1, 6);
      dieTwo = roll.nextInt (1, 6);
    }

    if (total == 2) {
      System.out.println ("Snake eyes!");
    }

    if (total == 7) {
      System.out.println ("Lucky seven!");
    }
  }
}

