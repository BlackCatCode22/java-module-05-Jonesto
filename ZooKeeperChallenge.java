import java.io.*;
import java.util.*;

        import java.util.Scanner;

        public class ZooKeeperChallenge {
            public static void main(String[] args) {
                Zookeeper zookeeper = new Zookeeper();
                Scanner scanner = new Scanner(System.in);
                boolean running = true;

                while (running) {
                    System.out.println("\nZoo Management System");
                    System.out.println("1. Add Animal");
                    System.out.println("2. Display Animals");
                    System.out.println("3. Remove Animal");
                    System.out.println("4. Exit");
                    System.out.print("Choose an option: ");

                    int choice = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    switch (choice) {
                        case 1:
                            System.out.print("Enter animal name: ");
                            String name = scanner.nextLine();
                            System.out.print("Enter species: ");
                            String species = scanner.nextLine();
                            System.out.print("Enter age: ");
                            int age = scanner.nextInt();
                            Animal animal = new Animal(name, species, age);
                            zookeeper.addAnimal(animal);
                            break;
                        case 2:
                            zookeeper.displayAnimals();
                            break;
                        case 3:
                            System.out.print("Enter the name of the animal to remove: ");
                            String removeName = scanner.nextLine();
                            zookeeper.removeAnimal(removeName);
                            break;
                        case 4:
                            running = false;
                            System.out.println("Exiting system.");
                            break;
                        default:
                            System.out.println("Invalid choice. Please try again.");
                    }
                }

                scanner.close();
            }
        }

    }