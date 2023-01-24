/*Дан массив nums = [3,2,2,3] и число val = 3.
  Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
  Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного,
  а остальные - равны ему.*/

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int[] nums = new int[]{3, 2, 2, 3};
        int val = 3;
        int size = nums.length;

        for (int i = size - 1; i>=0 ; i--) {
            for (int j = 0; j < i; j++) {
                if(nums[j] == val && nums[j+1] != 3){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
