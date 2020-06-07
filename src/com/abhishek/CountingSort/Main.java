package com.abhishek.CountingSort;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        int[] intArray = new int[]{2, 5, 9, 8, 2, 8, 7, 10, 4, 3};
        System.out.println("Array Before Sorting : " + Arrays.toString(intArray));
        countingSort(intArray, 1, 10);
        System.out.println("Array After Sorting : " + Arrays.toString(intArray));
    }
    private static void countingSort(int[] input, int min, int max) {
        int countingArray[] = new int[(max - min) + 1];
        for (int i = 0; i < input.length; i++) {
            countingArray[input[i] - min]++;
        }
        System.out.println("Counting Array : " + Arrays.toString(countingArray));
        int j = 0;
        for (int index = min; index <= max; index++) {
            while (countingArray[index - min] > 0) {
                input[j++] = index;
                countingArray[index - min]--;
            }
        }
    }
}
