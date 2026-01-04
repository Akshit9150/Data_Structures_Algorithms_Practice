//sorting techniques 
//the first one will be bubble sort
import java.util.*;
public class sort1{
  public static void main(String args[]){
    int arr[] = {23,11,4343,12,9,1};
    for(int i=0; i<arr.length-1; i++){
      for(int j=i+1; j<arr.length; j++){
        if(arr[i]>arr[j]){
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
}
}
}
for(int i=0; i<arr.length; i++){
  System.out.print(arr[i] + " "); 
}
}
}