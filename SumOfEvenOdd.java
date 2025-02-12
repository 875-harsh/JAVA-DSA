import java.util.Scanner;

public class SumOfEvenOdd {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.print("Enter number: ");
    int n=input.nextInt();
    int EvenSum=0;
    int OddSum=0;
    while(n>0){
      int i=n%10;
      if(i%2==0){
        EvenSum+=i;
      }else{
        OddSum+=i;
      }
      n/=10; 
    }
    System.out.println("sum of even integers:"+EvenSum);
    System.out.println("sum of odd integers:"+OddSum);
  }
}
