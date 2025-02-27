import java.util.Scanner;

public class Palindrome {

  public static boolean isPalin(int n){
    int palindrome=n;
    int rev=0;
    while(n>0){
      int ld=n%10;
      rev=rev*10+ld;
      n=n/10;
    }
    if(palindrome==rev){
      return true;
    }else{
      return false;
    }
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a number:");
    int n=sc.nextInt();
    if(isPalin(n)){
      System.out.println("PALINDROME");
    }
    else{
      System.out.println("NOT PALINDROME");
    }
  }
}
