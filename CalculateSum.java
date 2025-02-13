import java.util.Scanner;

public class CalculateSum {

  public static int calculateSum(int n1, int n2) {
    int sum = n1 + n2;
    System.out.print("SUM OF n1 AND n2:" + sum);
    return sum;
  }
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter number1: ");
    int n1 = input.nextInt();
    System.out.print("Enter number2: ");
    int n2 = input.nextInt();
    calculateSum(n1, n2);

  }
}
