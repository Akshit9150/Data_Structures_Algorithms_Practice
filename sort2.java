//selection sort  
import java.util.*;
public class sort2{
  public static void main(String args[]){
    int arr[] = {33,3,444,1,9,0};
    for(int i=0; i<arr.length-1; i++){
      for(int j=i; j<arr.length; j++){
        int min = arr[i];
        if(min>arr[j]){
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