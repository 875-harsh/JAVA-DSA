public class Swap2Number {

  public static void swap(int a, int b) {
    int temp = a;
    a = b;
    b = temp;
    System.out.println("After swapping a: " + a + " b: " + b);
  }
  public static void main(String[] args) {
    int a=10;
    int b=5;
    swap(a,b);
  }
}
