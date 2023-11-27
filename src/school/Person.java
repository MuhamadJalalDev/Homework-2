package school;
import java.util.Scanner;

public class Person {
    private String name;
    private String address;
    private int age;
    public Scanner scanner;

    public Person() {
        scanner = new Scanner(System.in);
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    public void captureDetails() {
        System.out.println("Enter Personal Information");
        System.out.print("Full Name:  ");
        name = scanner.nextLine();
        System.out.print("Address:  ");
        address = scanner.nextLine();
        System.out.print("Age:  ");
        captureAge();
    }

    private void captureAge() {
        int inputAge = scanner.nextInt();
        if (inputAge > 0) {
            age = inputAge;
        } else {
            System.out.println("Invalid age. Please enter a valid age.");
            System.out.print("Age:  ");
            captureAge();
        }
    }
}
