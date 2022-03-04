package algorithms.searching;

public int BinarySearch(int[] array, int value) {
  int n = array.length();

  double left = 0.0;
  double right = (double) n-1;
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
  BinarySearch(array, 3);
}
