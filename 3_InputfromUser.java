import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            // Input from User
        Scanner input = new Scanner(System.in);
        System.out.println("Enter id : ");
        int id = input.nextInt();

        System.out.println("Enter name : ");
        String name = input.next();

        System.out.println("Enter role : ");
        String role = input.next();

        System.out.println("Enter address : ");
        String address = input.next();
        // Result show the screen

        System.out.println("ID : "+id);
        System.out.println("Name : "+name);
        System.out.println("Role : "+role);
        System.out.println("Address : "+address);

    }



}
