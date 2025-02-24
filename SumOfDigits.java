public class SumOfDigits {

  public static int sumOfDigit(int n){
    int sum=0;
    n= Math.abs(n); //to handle negative numbers
    while(n>0){
      int ld=n%10;
      sum=sum+ld;
      n=n/10;
    }
    return sum;
  }
  public static void main(String[] args) {
    System.out.println("SUM OF DIGITS:"+sumOfDigit(-777));
  }
}
