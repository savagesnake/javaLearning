import java.util.Scanner;
class BasicCal{
  public static void main(String[] args) {
      Scanner wolf = new Scanner(System.in);
      double fnum, snum, answer;

      System.out.println("Enter first number:");
      fnum = wolf.nextDouble();

      System.out.println("Enter second number:");
      snum = wolf.nextDouble();

      answer = fnum  + snum;

      System.out.println(answer);

  }
}
