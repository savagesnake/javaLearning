import java.util.Scanner;
class App{
  public static void main(String[] args){
      // variable name has to be the same as the other class been called in
      outsideclasses outsideClass = new outsideclasses();
      outsideClass.simpleMessage();

      System.out.println("===========================");

      // using methods with params
      // use scanner to capture user input
      Scanner input = new Scanner(System.in);
      // create a object from the public class so we can use it
      usingmethods myName = new usingmethods();
      System.out.println("Enter your name here:");
      String name = input.nextLine();

      // pass the user input to the yourName method
      myName.yourName(name);

      System.out.printf("%nMany Methods");
      System.out.printf("%n===========================%n");

      System.out.println("Print name of first girlfriend: ");
      String temp = input.nextLine();
      manymethods girlname = new manymethods("Jennifer");
      girlname.setName(temp);
      girlname.saying();

      System.out.printf("%n===========================%n");

      // import the average class
        System.out.printf("%nAverage Calculator%n");
        System.out.println("How many score would you like to enter: ");

        average myaverage = new average();
        int total = Integer.parseInt(input.nextLine());
        myaverage.calculate(total);

   }
}
