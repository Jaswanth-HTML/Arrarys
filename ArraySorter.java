import java.util.Arrays;
import java.util.Scanner;

public class ArraySorter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose array dimension to sort:");
        System.out.println("1 - 1D Array");
        System.out.println("2 - 2D Array (sorts each row)");
        System.out.print("Enter choice (1/2): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1 -> handle1D(scanner);
            case 2 -> handle2D(scanner);
            default -> System.out.println("Invalid choice.");
        }

        scanner.close();
    }

    // --- 1D ARRAY ---
    private static void handle1D(Scanner scanner) {
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);

        System.out.println("\nSorted 1D Array:");
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // --- 2D ARRAY ---
    private static void handle2D(Scanner scanner) {
        System.out.print("Enter rows and columns: ");
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        int[][] matrix = new int[rows][cols];

        System.out.println("Enter " + (rows * cols) + " integers:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        for (int[] row : matrix) {
            Arrays.sort(row);
        }

        System.out.println("\nSorted 2D Array:");
        for (int i = 0; i < matrix.length; i++) {
            System.out.println("Row " + i + ":");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%4d", matrix[i][j]);
            }
            System.out.println();
        }
    }
}