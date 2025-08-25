import java.util.*;

public class Arraysinjava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ------------------ Task 1: 1D Array ------------------
        int[] numbers = new int[10];
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = sc.nextInt();
        }

        int sum = 0, max = numbers[0], min = numbers[0];
        for (int num : numbers) {
            sum += num;
            if (num > max) max = num;
            if (num < min) min = num;
        }

        double avg = (double) sum / numbers.length;

        System.out.println("\n--- 1D Array Results ---");
        System.out.println("Average = " + avg);
        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);

        // ------------------ Task 2: 2D Array ------------------
        int[][] matrix = new int[3][3];
        System.out.println("\nEnter 3x3 matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nTranspose of the Matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }

        // ------------------ Task 3: Bubble Sort & Binary Search ------------------
        System.out.println("\nOriginal Array:");
        System.out.println(Arrays.toString(numbers));

        // Bubble Sort
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    // Swap
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted Array (Bubble Sort):");
        System.out.println(Arrays.toString(numbers));

        // Binary Search
        System.out.print("\nEnter number to search: ");
        int key = sc.nextInt();

        int low = 0, high = numbers.length - 1, mid;
        boolean found = false;

        while (low <= high) {
            mid = (low + high) / 2;
            if (numbers[mid] == key) {
                System.out.println("Element found at index: " + mid);
                found = true;
                break;
            } else if (numbers[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (!found) {
            System.out.println("Element not found in the array.");
        }
    }
}
