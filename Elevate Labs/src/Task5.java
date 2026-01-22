public class Task5 {

    // Method to calculate sum of array elements
    static int calculateSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    // Method to find maximum value
    static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max)
                max = num;
        }
        return max;
    }

    // Method to find minimum value
    static int findMin(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min)
                min = num;
        }
        return min;
    }

    // Method to sort array manually using Bubble Sort
    static void bubbleSort(int[] arr) {
        int n = arr.length;

        // Bubble sort logic
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Swap if elements are in wrong order
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Method to display array elements
    static void displayArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // 1D Array example
        int[] numbers = {45, 12, 89, 33, 67, 5, 91};

        System.out.println("------ 1D Array Operations ------");
        System.out.print("Original Array: ");
        displayArray(numbers);

        int sum = calculateSum(numbers);
        double average = (double) sum / numbers.length;
        int max = findMax(numbers);
        int min = findMin(numbers);

        // Display results in formatted output
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);

        // Sorting the array
        bubbleSort(numbers);
        System.out.print("Sorted Array: ");
        displayArray(numbers);

        // 2D Array example (marks of students)
        int[][] marks = {
                {85, 78, 92},
                {74, 88, 69},
                {90, 81, 76}
        };

        System.out.println("\n------ 2D Array (Students Marks) ------");

        // Traversing 2D array using nested loops
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            for (int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }

        // Demonstrating ArrayIndexOutOfBoundsException handling
        System.out.println("\n------ Exception Handling Demo ------");
        try {
            System.out.println(numbers[100]); // Invalid index
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception Caught: Array index is out of range!");
        }

        System.out.println("\nProgram executed successfully.");
    }
}

