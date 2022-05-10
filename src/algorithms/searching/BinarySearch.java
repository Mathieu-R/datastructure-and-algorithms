package algorithms.searching;

/**
 * Search an item in an Array of integers by splitting it in two parts.
 * Repeat the operation until the item is found.
 * We assume the Array is sorted in asc. order.
 */
public class BinarySearch {
  private int[] array;
  private int value; // value searched

  public BinarySearch(int[] array, int value) {
    this.array = array;
    this.value = value;
  }

  public int search() {
    int n = array.length();

    double left = 0.0;
    double right = (double) n - 1;
    double mid;

    // Apparently, comparing two double is bad practice
    // Better is to compare with a small epsilon value
    double epsilon = 0.00000001

    while ((left - right) > epsilon) {
      mid = (left + right) / 2.0;
      if (value > array[mid]) {
        left = mid + 1;
      } else {
        right = mid;
      }
    }

    if (array[left] == value) {
      return left;
    } else {
      return -1;
    }
  }

  public static void main(String[] args) {
    int[] array = new int[5]{0, 1, 3, 7, 10};

    BinarySearch binarySearch = new BinarySearch(array, 3);
    int value = binarySearch.search();

    System.out.println("value; ", value);
  }
}
