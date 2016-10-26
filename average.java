import java.util.Scanner;
public class average{
  public void calculate(int counter){
    Scanner input = new Scanner(System.in);
    int total = 0;
    int grade;
    int average;
    int count = 0;
    while(count < counter ){
      System.out.println("Enter score #"+(count+1));
      grade = input.nextInt();
      total = total + grade;
      count++;
    }
    average = total / count;
    System.out.println("Your average: "+average);
  }
}
