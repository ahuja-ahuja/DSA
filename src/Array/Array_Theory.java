package Array;

public class Array_Theory {
    /*  theory from geeks_for_geeks






     * */
    public static void insertElement(int arr[], int n, int pos, int value) {
        int idx = pos - 1;
        for (int i = n - 1; i >= idx; i--) {
            arr[i + 1] = arr[i];
        }
        arr[idx] = value;
    }

    public static int largestElement(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }
    public static Object secondLargestElement(int arr[]) {
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = arr[i];

            }
        }
        return null;
    }

    public static void deleteElement() {
        int arr[] = {10, 20, 30, 40, 50, 60};
        int del = 30;
        int delPosition = 0;
        //first find the index of the delete element
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == del) {
                delPosition = i;
                break;
            }
        }
        // shift one element before from delPosition until last
        for (int i = delPosition; i < arr.length; i++) {
            arr[i] = arr[i + 1];
        }
    }

    public static void main(String[] args) {
        int[] largest = {20, 30, 55, 40};
        System.out.println(largestElement(largest));
    }

}
