class D1GramsToPounds extends ConsoleProgram {

  /**
  * Write a program that outputs a formatted table that shows a conversion from grams to pounds from 100 to 1000 grams.
  * The table should display for every 100 grams.
  * The pounds values must be calculated.
  * The grams column should be formatted to take up 6 spaces
  * The pounds column should be formatted to take up 10 spaces.
  * @author: H. Ye
  */
  
  public void run() {

    double dblPounds;
    //output table header
    System.out.printf("%6s, %10s, %n", "grams", "pounds");
    System.out.println ("----------------------");

    // convert grams to pounds
    for (int intGrams = 100; intGrams <= 1000; intGrams += 100){
    dblPounds = intGrams * 0.00220462;
    System.out.printf("%6d %10.4f %n", intGrams, dblPounds);
    }
  }
}
