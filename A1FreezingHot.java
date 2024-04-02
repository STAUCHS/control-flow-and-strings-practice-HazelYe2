class A1FreezingHot extends ConsoleProgram {

  /**
  * Given two temperatures via user input, output true if one is less than 0 and the other is greater than 100
  * @author: H. Ye
  */
  
  public void run() {

    // Get user input

    int tempOne = readInt ("Input the first temperature: ");
    int tempTwo = readInt ("Input the second temperature: ");

    // Output true if one is less than 0 and the other is greater than 100
    if (tempOne < 0 && tempTwo > 100 || tempOne > 100 && tempTwo < 0)
    {
      System.out.println ("True");
    }
    else 
    {
      System.out.println ("False");
    }

  }
}
