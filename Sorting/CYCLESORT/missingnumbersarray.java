package Sorting.CYCLESORT;

import java.util.ArrayList;
import java.util.List;

public class missingnumbersarray {

  public static void main(String[] args) {
    int[] arr = { 1, 3, 2, 4, 6, 3, 2, 8 };
    List<Integer> miss = missingNumbers(arr);
    System.out.println(miss);
  }

  static List<Integer> missingNumbers(int[] arr) {

    int index = 0;

    while (index < arr.length) {
      int correct = arr[index] - 1;

      if (arr[index] > 0 &&
          arr[index] <= arr.length &&
          arr[index] != arr[correct]) {

        int temp = arr[index];
        arr[index] = arr[correct];
        arr[correct] = temp;
      } else {
        index++;
      }
    }

    List<Integer> ans = new ArrayList<>();

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] != i + 1) {
        ans.add(i + 1);
      }
    }

    return ans;
  }
}