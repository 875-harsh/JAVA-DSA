import java.util.Scanner;

public class ReverseOfNumber {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.print("Enter number: ");
    int n=input.nextInt();
    int rev;
    while(n>0){
      rev=n%10;
      System.out.print(rev);
      n/=10;
    } 
  }
   /*int n=198043;
   int rev=0;
   while(n>0){
    int LD=n%10;
    rev=(rev*10)+LD;
    n/=10;
   }
   System.out.print(rev);*/
  
}

