package algorithms.sorting;

import java.util.Arrays;

/**
 * Bubble Sort is a sorting algorithm.
 * We sort an array of integers by swapping values.
 * Time complexity :
 *  - Best case : O(n) [array already sorted]
 *  - Worst case : Omega(n^2) [need to swap every entry]
 * Explanation : shorturl.at/fpwCF
 */
public class BubbleSort {
  private int[] arr;
  private boolean swapped = false;

  public BubbleSort(int[] arr) {
    this.arr = arr;
  }

  public int[] sort() {
    // perform n pass
    for (int i = 0; i < arr.length; i++) {
      swapped = false;
      // at each pass, swap with the neighbor if needed
      // the greatest value will be placed at the end of the array
      // so we do not need to go unto that position at the next pass
      // (that's where the "- i" comes from
      for (int j = 0; j < (arr.length - 1) - i; j++) {
        if (arr[j] > arr[j+1]) {
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;

          swapped = true;
        }
      }

      // if no swap at the first pass
      // it means that the array is already sorted
      if (!swapped) {
        break;
      }
    }

    return arr;
  }

  public static void main(String[] args) {
    int arr[] = new int[]{1, 4, 2, 5, 4, 3, 9, 1, 7, 4, 6, 2, 10};
    BubbleSort bubbleSorter = new BubbleSort(arr);

    int[] sortedArr = bubbleSorter.sort();
    System.out.println(Arrays.stream(sortedArr).toArray());
  }
}
