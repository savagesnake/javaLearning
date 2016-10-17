class switchStatement{
  public static void main(String[] args){

    // declare interger number
      int luckyNumber = 7;

    // declare a switch statement and pass the luckyNumber in as the argument
      switch(luckyNumber){
        // check for the value and print to console if this case is true and break
        case 3:
          System.out.println("3 is not your lucky number");
          break;
        case 4:
          System.out.println("4 is not your lucky number");
          break;
        case 7:
          System.out.println("7 is your lucky number");
          break;
          // if no match set a default 
        default:
          System.out.println("Don't know what is you lucky number");
          break;
      }
  }
}
