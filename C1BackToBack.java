class C1BackToBack extends ConsoleProgram {

  /**
  * Given a string, take the last character and print a new string with the last character added at the front and back, so "cat" yields "tcatt". 
  * The original string will be length 1 or more.
  * @author: H. Ye
  */
  
  public void run() {

    // Declare variables
    String word = readLine ("Input any word: ");
    String lastChar;
    String newWord;

    // Add last character to front and back
    lastChar = word.substring(word.length() - 1);
    newWord = lastChar + word + lastChar;

    // Ouput new word
    System.out.println (newWord);
  }
}
