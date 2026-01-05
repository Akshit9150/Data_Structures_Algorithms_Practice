//the question is merge sort
import java.util.*;
public class sort3{
public void mergeSort(int[] arr, int left, int right) {
    if (left < right) {
        int mid = (left + right) / 2; // Find the middle point
        mergeSort(arr, left, mid); // Sort left half
        mergeSort(arr, mid + 1, right); // Sort right half
        merge(arr, left, mid, right); // Merge both halves
    }
}

public void merge(int[] arr, int left, int mid, int right) {
    int n1 = mid - left + 1;
    int n2 = right - mid;

    int[] leftArray = new int[n1];
    int[] rightArray = new int[n2];

    for (int i = 0; i < n1; i++) {
        leftArray[i] = arr[left + i];
    }
    for (int i = 0; i < n2; i++) {
        rightArray[i] = arr[mid + 1 + i];
    }

    int i = 0, j = 0, k = left;
    while (i < n1 && j < n2) {
        if (leftArray[i] <= rightArray[j]) {
            arr[k++] = leftArray[i++]; // Copy smaller element
        } else {
            arr[k++] = rightArray[j++];
        }
    }

    while (i < n1) {
        arr[k++] = leftArray[i++]; // Copy remaining from left side
    }
    while (j < n2) {
        arr[k++] = rightArray[j++]; // Copy remaining from right side
    }
}
public static void main(String args[]){
  int arr[] = {38, 27, 43, 3, 9, 82, 10};
  sort3 obj = new sort3();
  obj.mergeSort(arr, 0, arr.length-1);
  System.out.println(Arrays.toString(arr));
}
}