import java.util.Scanner;

public class SortingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get array input from user
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter " + n + " integers: ");
        for (int i = 0; i < n; i++)
            arr[i] = scanner.nextInt();

        // Choose sorting algorithm
        System.out.println("\nChoose Sorting Algorithm:");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Insertion Sort");
        System.out.println("3. Merge Sort");
        System.out.println("4. Quick Sort");
        System.out.print("Enter your choice (1-4): ");
        int choice = scanner.nextInt();

        // Sort based on choice
        switch (choice) {
            case 1:
                BubbleSort.sort(arr);
                break;
            case 2:
                InsertionSort.sort(arr);
                break;
            case 3:
                MergeSort.sort(arr, 0, arr.length - 1);
                break;
            case 4:
                QuickSort.sort(arr, 0, arr.length - 1);
                break;
            default:
                System.out.println("Invalid choice!");
                return;
        }

        // Display result
        System.out.println("\nSorted array:");
        for (int num : arr)
            System.out.print(num + " ");
    }
}
