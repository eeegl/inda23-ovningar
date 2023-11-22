import java.util.Arrays;

// Example arrays
int[] a = { 1, 2, 3 };
int[] b = { 4, 5, 6 };

// Set all array elements to zero
public int[] clear(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
        arr[i] = 0;
    }
    return arr;
}

// Copy array first, then clear the copy
public int[] copyAndClear(int[] arr) {
    int[] copy = Arrays.copyOf(arr, arr.length);
    return clear(copy);
}
