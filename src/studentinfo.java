import java.util.Scanner;
public class studentinfo {
        public static void main (String[] args) {
            Scanner sc = new Scanner(System.in);

            // Taking input
            System.out.println("Enter Name:");
            String name = sc.nextLine();

            System.out.println("Enter Roll No:");
            String roll = sc.nextLine();

            System.out.println("Enter Section:");
            String section = sc.nextLine();

            System.out.println("Enter Branch:");
            String branch = sc.nextLine();

            // Displaying output
            System.out.println("Display Name: " + name);
            System.out.println("Display Roll No: " + roll);
            System.out.println("Display Section: " + section);
            System.out.println("Display Branch: " + branch);
        }
    }


