import java.util.*;


public class LinearSearching {
  public static void main(String[] args) {
    int numbers[]={1,3,6,38,9,10,42};
    int key=9;
    int index=linearSearch(numbers, key);
    if(index==-1){
      System.out.println("NOT FOUND");
    }
    else{
      System.out.print("KEY IS AT INDEX:"+index);
    }

  }

  public static int linearSearch(int numbers[],int key){
    for(int i=0;i<numbers.length;i++){
      if(numbers[i]==key){
        return i;
      }
    }
    return -1;
  }
}
