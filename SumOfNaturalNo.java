import java.util.Scanner;

public class SumOfNaturalNo {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.print("Enter number: ");
    int n=input.nextInt();
    int sum=0;
    int i=1;
    while(i<=n){
      sum=sum+i;
      i++;
    }
    System.out.print("SUM OF n NATURAL NO.:"+sum);
  }
}