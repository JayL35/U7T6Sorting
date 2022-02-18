import java.util.Arrays;

public class SortTester
{
  public static void main(String[] args)
  {
    /* --- SELECTION SORT --- */
    int[] arr1 = {8, 10, 21, 24, 26, 32, 33, 37, 79, 65, 59, 37, 28, 22, 18, 16};
    Sort.selectionSort(arr1);
    System.out.println(Arrays.toString(arr1));
 
    /* --- INSERTION SORT --- */ 
    int[] arr2 = {8, 10, 21, 24, 26, 32, 33, 37, 79, 65, 59, 37, 28, 22, 18, 16};
    Sort.insertionSort(arr2);
    System.out.println(Arrays.toString(arr2));
  }
}
