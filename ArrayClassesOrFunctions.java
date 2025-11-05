package Arrays;

import java.util.Arrays;

public class ArrayClassesOrFunctions {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 6};
        System.out.println("Integer Array as List: " + Arrays.asList(array));
        int unsortedArray[] = {12, 6, 74, 32, 1};
        Arrays.sort(unsortedArray);
        int valueFind = 32;
        System.out.println(valueFind + " found at " + Arrays.binarySearch(unsortedArray, valueFind));
        System.out.println(valueFind + " found at " + Arrays.binarySearch(unsortedArray,1,4, valueFind));

        System.out.println("Arrays on comparison: " + Arrays.compare(array, unsortedArray));

        System.out.println("Arrays on unsigned comparison: " + Arrays.compareUnsigned(array, unsortedArray));

        System.out.println("Integer Array: " + Arrays.toString(array));
        System.out.println("New Array created by (copyOf) function: ");
        System.out.println("New Integer Array: " + Arrays.toString(Arrays.copyOf(unsortedArray, 7)));

        System.out.println("New Array created by (copyOfRange) function: ");
        System.out.println("New Integer Array : " + Arrays.toString(Arrays.copyOfRange(unsortedArray, 1, 3)));

        int[][] deepArray = {{1, 2, 4}};
        int[][] deepArray1 = {{1, 4, 2}};

        System.out.println("Two integer arrays on deep check for comparison: " + Arrays.deepEquals(deepArray, deepArray1));

        System.out.println("DeepHash code for the DeepArray1: " + Arrays.deepHashCode(deepArray1));

        System.out.println("DeepString of deepArray1: " + Arrays.deepToString(deepArray1));

        System.out.println("Integer Arrays on comparison with (equals) function: " + Arrays.equals(array, unsortedArray));

        int newArray[] = {10, 7, 12, 83};
        int newInsertValue = 23;

        Arrays.fill(newArray, newInsertValue);
        System.out.println("New Array after (fill) function: " + Arrays.toString(newArray));

        System.out.println("Integer Array: " + Arrays.hashCode(array));

        int arr[] = {1, 7, 9, 11};
        int arr1[] = {1, 7, 11, 9};

        System.out.println("Mismatch at index of arrays (arr[]) & (arr1[]) : " + Arrays.mismatch(arr, arr1));

        Arrays.parallelSort(arr1);
        System.out.println("Array after ParallelSort : " + Arrays.toString(arr1));


    }
}
