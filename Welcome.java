import java.util.Scanner;
public class Welcome {
    public static void main(String[] args) {
         Scanner scanner = new Scanner (System.in);
         System.out.print("Enter your First Name:");
         String fname = scanner.nextLine();
         System.out.print("Enter your Last Name:");
         String lname = scanner.nextLine();
         System.out.println("welcome to the Second Year "+fname+" "+lname);
         
   }
}

