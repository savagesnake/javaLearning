class switchStatement{
  public static void main(String[] args){
      int luckyNumber = 7;

      switch(luckyNumber){
        case 3:
          System.out.println("3 is not your lucky number");
          break;
        case 4:
          System.out.println("4 is not your lucky number");
          break;
        case 7:
          System.out.println("7 is your lucky number");
          break;
        default:
          System.out.println("Don't know what is you lucky number");
          break;
      }
  }
}
