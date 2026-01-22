import java.util.Scanner;
public class Task3 {

        // Method to validate marks
        static boolean isValidMarks(int marks) {
            return marks >= 0 && marks <= 100;
        }

        // Method to calculate percentage
        static double calculatePercentage(int total, int subjects) {
            return (double) total / subjects;
        }

        // Method to assign grade using if-else
        static String assignGrade(double percentage) {
            if (percentage >= 90)
                return "A+";
            else if (percentage >= 80)
                return "A";
            else if (percentage >= 70)
                return "B";
            else if (percentage >= 60)
                return "C";
            else if (percentage >= 50)
                return "D";
            else
                return "F";
        }

        // Method to show performance using switch
        static void showPerformance(String grade) {
            switch (grade) {
                case "A+":
                case "A":
                    System.out.println("Performance: Excellent");
                    break;
                case "B":
                    System.out.println("Performance: Very Good");
                    break;
                case "C":
                    System.out.println("Performance: Good");
                    break;
                case "D":
                    System.out.println("Performance: Average");
                    break;
                case "F":
                    System.out.println("Performance: Fail");
                    break;
                default:
                    System.out.println("Performance: Unknown");
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            while (true) {
                System.out.println("\n--- Student Result Processing System ---");

                System.out.print("Enter student name (or type EXIT to stop): ");
                String name = sc.next();

                if (name.equalsIgnoreCase("EXIT")) {
                    System.out.println("Exiting program...");
                    break; // using break
                }

                System.out.print("Enter number of subjects: ");
                int subjects = sc.nextInt();

                int totalMarks = 0;

                for (int i = 1; i <= subjects; i++) {
                    System.out.print("Enter marks for subject " + i + ": ");
                    int marks = sc.nextInt();

                    // Validation logic
                    if (!isValidMarks(marks)) {
                        System.out.println("Invalid marks! Enter between 0 and 100.");
                        i--; // repeat same subject
                        continue; // using continue
                    }

                    totalMarks += marks;
                }

                double percentage = calculatePercentage(totalMarks, subjects);
                String grade = assignGrade(percentage);

                // Final result summary
                System.out.println("\n--- Result Summary ---");
                System.out.println("Student Name: " + name);
                System.out.println("Total Marks: " + totalMarks);
                System.out.println("Percentage: " + percentage + "%");
                System.out.println("Grade: " + grade);

                showPerformance(grade);
            }

            sc.close();
        }
    }

}
