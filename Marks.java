import java.util.Scanner;

public class Marks {
    static int[][] marks;
    static int n;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        n = scanner.nextInt();
        marks = new int[n+1][4];
            
            while (true) {
            System.out.println("1. Add student marks");
            System.out.println("2. Update student mark");
            System.out.println("3. Get average mark of a subject");
            System.out.println("4. Get average mark of a student");
            System.out.println("5. Get total marks of a student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice (1-6): ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1: {
                    System.out.print("Enter student ID: ");
                    int id = scanner.nextInt();
                    if (id >= 1 && id <= n) {
                        System.out.print("Enter Mathematics mark: ");
                        marks[id][1] = scanner.nextInt();
                        System.out.print("Enter Chemistry mark: ");
                        marks[id][2] = scanner.nextInt();
                        System.out.print("Enter Physics mark: ");
                        marks[id][3] = scanner.nextInt();
                    } else {
                        System.out.println("Invalid student ID.");
                    }
                    break;
                }
                case 2: {
                    System.out.print("Enter student ID: ");
                    int studentId = scanner.nextInt();
                    System.out.print("Enter subject ID (1=Math, 2=Chem, 3=Phys): ");
                    int subjectId = scanner.nextInt();
                    if (studentId >= 1 && studentId <= n && subjectId >= 1 && subjectId <= 3) {
                        System.out.print("Enter new mark: ");
                        marks[studentId][subjectId] = scanner.nextInt();
                    } else {
                        System.out.println("Invalid student ID or subject ID.");
                    }
                    break;
                }
                case 3:{
                    System.out.print("Enter subject ID (1=Math, 2=Chem, 3=Phys): ");
                    int subjectId = scanner.nextInt();
                    if (subjectId >= 1 && subjectId <= n) {
                         int total= 0;
                         for (int i = 1; i <= n; i++) {
                            total += marks[i][subjectId];
                         }
                         double avg = total / n;
                        System.out.printf("Average mark of subject %d: %.2f\n", subjectId, avg);
                    }else{
                       System.out.printf("Invalid subject ID.");
                    }
                    break;
                }
                case 4:{
                    System.out.print("Enter student ID: ");
                    int studentId = scanner.nextInt();
                    if (studentId >= 1 && studentId <= n) {
                       double avg = (marks[studentId][1] + marks[studentId][2] + marks[studentId][3]) / 3.0;
                       System.out.printf("Average mark of student %d: %.2f\n", studentId, avg);
                    }else{
                        System.out.printf("Invalid student ID");
                    }
                    break;
                }
                case 5:{
                    System.out.print("Enter student ID: ");
                    int studentId = scanner.nextInt();
                    if (studentId >= 1 && studentId <= n) {
                       int total = marks[studentId][1] + marks[studentId][2] + marks[studentId][3];
                       System.out.println("Total marks of student " + studentId + ": " + total);
                    }else{
                       System.out.printf("Invalid student Id .");
                    }
                    break;
                }
                case 6:{
                    System.out.println("Exiting program.");
                    scanner.close();
                    return;
                }
                default:
                    System.out.println("Invalid choice.");
                
            }
         }
        }
     }
