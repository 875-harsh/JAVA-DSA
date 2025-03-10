public class LargestNoInArray {
  public static void main(String[] args) {
    int numbers[]={1,3,5,7,2,4};
    System.out.println("LARGEST NO.IN ARRAY:" +Largest(numbers));
  }
  public static int Largest(int numbers[]){
    int n=Integer.MIN_VALUE;
    for(int i=0;i<numbers.length;i++){
      if(n<numbers[i]){
        n=numbers[i];
      }
    }
    return n;
  }
}
