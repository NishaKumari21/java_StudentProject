import java.util.Scanner;

public class project1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter MATHS marks:");
        int maths = sc.nextInt();
        System.out.println("Enter SCI marks:");
        int sci = sc.nextInt();
        System.out.println("Enter SST marks:");
        int sst = sc.nextInt();
        System.out.println("Enter HINDI marks:");
        int hindi = sc.nextInt();
        System.out.println("Enter ENGLISH marks:");
        int eng = sc.nextInt();

        int totalMarks = maths + sci + sst + hindi + eng; // Obtained Marks
        int maxMarks = 500; // Total Maximum Marks

        // Corrected percentage calculation
        double percent = (totalMarks / 500.0) * 100;  // Using 500.0 for float division

        // Print percentage with 2 decimal places
        System.out.printf("YOUR AVERAGE PERCENTAGE IS: %.2f%%\n", percent);

        sc.close(); // Close Scanner
    }
}

