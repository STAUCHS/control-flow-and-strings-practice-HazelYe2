class A2HasTeen extends ConsoleProgram {

  /**
  * We'll say that a number is "teen" if it is in the range 13..19 inclusive. 
  * Given 3 int values via user input, output true if 1 or more of them are teen.
  * @author: H. Ye
  */
  
  public void run() {
    int firstAge = readInt ("Input the first value: ");
    int secondAge = readInt ("Input the second value: ");
    int thirdAge = readInt ("Input the third value: ");
    
    if (firstAge >= 13 && firstAge <= 19 || secondAge >= 13 && secondAge <= 19 || thirdAge >=13 && secondAge <=19)
    {
      System.out.println ("True");
    }
    else
    {
      System.out.println ("False");
    }
  }
}
