import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class AttendanceManagement {
        public static void main(String[] args) {
            class Attendance {
                private String studentName;
                private boolean isPresent;

                public Attendance(String studentName, boolean isPresent) {
                    this.studentName = studentName;
                    this.isPresent = isPresent;
                }

                @Override
                public String toString() {
                    return "Student Name: " + studentName + ", Present: " + isPresent;
                }
            }
            List<Attendance> attendanceList = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("\nSimple Attendance Management System");
                System.out.println("1. Add Attendance");
                System.out.println("2. View Attendance");
                System.out.println("3. Exit");
                System.out.print("Enter your choice: ");

                int choice = scanner.nextInt();
                scanner.nextLine();  // Consume newline

                switch (choice) {
                    case 1:
                        System.out.print("Enter student name: ");
                        String studentName = scanner.nextLine();
                        System.out.print("Is the student present? (true/false): ");
                        boolean isPresent = scanner.nextBoolean();
                        scanner.nextLine();  // Consume newline
                        Attendance attendance = new Attendance(studentName, isPresent);
                        attendanceList.add(attendance);
                        System.out.println("Attendance recorded for " + studentName);
                        break;
                    case 2:
                        System.out.println("Attendance Records:");
                        for (Attendance record : attendanceList) {
                            System.out.println(record);
                        }
                        break;
                    case 3:
                        System.out.println("Exiting the program. Goodbye!");
                        scanner.close();
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        }
    }