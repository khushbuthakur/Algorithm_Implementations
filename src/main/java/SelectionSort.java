import java.util.Arrays;

public class SelectionSort {

  /**
   * Selection sort in form of gypsy dance : https://www.youtube.com/watch?v=Ns4TPTC8whw
   * @param args
   */

  public static void main(String[] args) {
    int[] nums = {30, 1, 20, -3, 55, 2};

    SelectionSort ss = new SelectionSort();
    ss.selectionSort(nums);
    /**
     * Before : [30, 1, 20, -3, 55, 2]
     * Operation : [-3, 1, 20, 30, 55, 2]
     * Operation : [-3, 1, 20, 30, 55, 2]
     * Operation : [-3, 1, 2, 30, 55, 20]
     * Operation : [-3, 1, 2, 20, 55, 30]
     * Operation : [-3, 1, 2, 20, 30, 55]
     * After : [-3, 1, 2, 20, 30, 55]
     */
  }

  /**
   * in selection sort we swap current value with minimum value in array
   *
   * for e.g.
   * arr[0] = 30
   * so we will find smallest value after 0, and swap it
   * arr[3] = -3
   *
   * so -> arr[0] = -3
   * arr[3] = 30;
   *
   * @param nums
   * @return
   */
  public int[] selectionSort(int[] nums) {
    System.out.println("Before : " + Arrays.toString(nums));

    for (int i = 0; i < nums.length - 1; i++) {
      int swap_index = i;

      for (int j = i + 1; j < nums.length; j++) {
        /**
         * if current value at j is lower than swap value, then take this as new index
         */
        if (nums[j] < nums[swap_index]) {
          swap_index = j;
        }
      }

      /**
       * only swap when both indexes are same
       * for e.g. arr[1] = 1
       * and it is smallest after -3, so it does not need to be swapped
       */

      if (swap_index != i) {
        int temp = nums[i];
        nums[i] = nums[swap_index];
        nums[swap_index] = temp;
      }

      System.out.println("Operation : " + Arrays.toString(nums));
    }

    System.out.println("After : " + Arrays.toString(nums));
    return nums;
  }
}
