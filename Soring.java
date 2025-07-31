import java.util.Scanner;

public class SortingApp {

    // Bubble Sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }

    // Insertion Sort
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j = j - 1;
            }
            arr[j+1] = key;
        }
    }

    // Print Array
    public static void printArray(int[] arr) {
        for (int num : arr)
            System.out.print(num + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Choose Sorting Algorithm:");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Insertion Sort");
        System.out.print("Enter your choice (1-2): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                bubbleSort(arr);
                break;
            case 2:
                insertionSort(arr);
                break;
            default:
                System.out.println("Invalid choice!");
                return;
        }

        System.out.println("Sorted Array:");
        printArray(arr);
    }
}
