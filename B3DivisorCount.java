class B3DivisorCount extends ConsoleProgram {

  /**
  * Enter an integer and that prints all the divisors of that number
  * Note that d is a divisor of n if n%d=0
  * @author: H. Ye
  */
  
  public void run() {

    // Declare variable and get user input
    int integer = readInt ("Enter an integer: ");

    // Check for divisors between 1 and integer
    for (int divisor = 1; divisor <= integer; divisor++)
    {
      if (integer % divisor == 0) 
      {
        System.out.println (divisor);
      }
    }
  }
}

