import java.util.*;
public class BinomialCoefficient {

  public static int fact(int n){
    int f=1;
    for(int i=1;i<=n;i++){
      f*=i;
    }
    return f;
  }

  public static int BiomCoeff(int n,int r){
    int n_fact=fact(n);
    int r_fact=fact(r);
    int nmr_fact=fact(n-r);
    int BiomCoeff=n_fact/(r_fact*nmr_fact);
    return BiomCoeff;
  }
  public static void main(String[] args) {
    System.out.println("BINOMIAL COEFFICIENT:"+BiomCoeff(5,2));
  }
}
