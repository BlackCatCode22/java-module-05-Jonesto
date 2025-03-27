import java.io.*;
import java.util.*;

public class ZooKeeperChallenge {
    public static void main(String[] args) {
        Zookeeper zookeeper = new Zookeeper();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            printMenu();
            int choice = getValidChoice(scanner);

            switch (choice) {
                case 1:
                    addAnimal(zookeeper, scanner);
                    break;
                case 2:
                    zookeeper.displayAnimals();
                    break;
                case 3:
                    removeAnimal(zookeeper, scanner);
                    break;
                case 4:
                    running = false;
                    System.out.println("Exiting system.");
                    break;
            }
        }

        scanner.close();
    }

    private static void printMenu() {
        System.out.println("\nZoo Management System");
        System.out.println("1. Add Animal");
        System.out.println("2. Display Animals");
        System.out.println("3. Remove Animal");
        System.out.println("4. Exit");
        System.out.print("Choose an option: ");
    }

    private static int getValidChoice(Scanner scanner) {
        while (true) {
            try {
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                if (choice >= 1 && choice <= 4) {
                    return choice;
                } else {
                    System.out.println("Invalid choice. Please try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // Consume invalid input
            }
        }
    }

    private static void addAnimal(Zookeeper zookeeper, Scanner scanner) {
        System.out.print("Enter animal name: ");
        String name = scanner.nextLine();
        System.out.print("Enter species: ");
        String species = scanner.nextLine();
        int age = getValidAge(scanner);
        Animal animal = new Animal(name, species, age);
        zookeeper.addAnimal(animal);
    }

    private static int getValidAge(Scanner scanner) {
        while (true) {
            try {
                System.out.print("Enter age: ");
                int age = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                if (age >= 0) {
                    return age;
                } else {
                    System.out.println("Invalid age. Please enter a non-negative number.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // Consume invalid input
            }
        }
    }

    private static void removeAnimal(Zookeeper zookeeper, Scanner scanner) {
        System.out.print("Enter the name of the animal to remove: ");
        String removeName = scanner.nextLine();
        zookeeper.removeAnimal(removeName);
    }
}