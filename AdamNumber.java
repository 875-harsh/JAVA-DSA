import java.util.Scanner;

public class AdamNumber {
  public static void main(String[] args) {
    int n=21;
    int r1=0,r2=0;
    int sq=n*n;
    while(sq>0){
      int d=sq%10;
      r1=r1*10+d;
      sq=sq/10;
    }
    int a=(int)Math.sqrt(r1);
    while(a>0){
      int d=a%10;
      r2=r2*10+d;
      a=a/10;
    }
    if(r2==n){
      System.out.println("Adam Number");
    }
    else{
      System.out.println("Not an Adam Number");
    }

  }
}
