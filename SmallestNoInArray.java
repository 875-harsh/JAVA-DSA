public class SmallestNoInArray {
  public static void main(String[] args) {
    int numbers[]={2,8,5,35,1,7};
    System.out.println("SMALLEST NO.IN ARRAY:" +lowest(numbers));
  }
  public static int lowest(int numbers[]){
    int s=Integer.MAX_VALUE;
    for(int i=0;i<numbers.length;i++){
      if(s>numbers[i]){
        s=numbers[i];
      }
    }
    return s;
  }
}
