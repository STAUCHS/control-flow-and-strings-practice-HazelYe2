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
    System.out.printf("%5s, %10s, %n", "grams", "pounds");
    System.out.println ("---------------");

    for (int intGrams = 10; intGrams <= 100; intGrams += 10){
    dblPounds = intGrams * 10;
    System.out.printf("%5d %10.2f %n", intGrams, dblPounds);
    }
  }
}
