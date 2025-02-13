import java.util.Scanner;

public class CheckPrimeNo {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.print("Enter number: ");
    int n=input.nextInt();
    
    if(n==2){
      System.out.print("Prime number");
    }else{
      boolean isPrime=true;
      for(int i=2;i<=n-1;i++){
        if(n%i==0){
        isPrime=false;
      }
    }

      if(isPrime==true){
        System.out.print("Prime number");
      }else{
        System.out.print("Not Prime Number");
      }
    }
    
  }
}
