class C2EveryNth extends ConsoleProgram {

  /**
  * Given a non-empty string and an int N, return the string made starting with character 0, and then every Nth char of the string
  * So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more
  * @author:
  */
  
  public void run() {

    // Declare variables and get user input
    String word = readLine ("Input a word: ");
    int integer = readInt ("Enter an integer: ");
    int length;
    int newWord;
    int nthChar;

    length = word.length();
    newWord = "";

    for (int counter = 0; counter <= length; counter += nthChar)


  }
}
