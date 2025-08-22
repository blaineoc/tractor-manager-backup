package ie.atu.tractormanager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user how many tractors they want to manage
        System.out.print("Enter maximum number of tractors: ");
        int max = sc.nextInt();
        TractorManager manager = new TractorManager(max);

        while (true) {
            // Main menu
            System.out.println("\n--- Tractor Manager ---");
            System.out.println("1. Add Tractor");
            System.out.println("2. Delete Tractor");
            System.out.println("3. Find Tractor");
            System.out.println("4. Count Tractors");
            System.out.println("5. List All Tractors");
            System.out.println("6. List Tractors by VIN (Sorted)");
            System.out.println("7. Perform Maintenance on All");
            System.out.println("8. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    // Add new tractor
                    System.out.print("VIN: ");
                    String vin = sc.next();
                    System.out.print("Age: ");
                    int age = sc.nextInt();
                    System.out.print("Registered (true/false): ");
                    boolean registered = sc.nextBoolean();
                    System.out.print("Horsepower: ");
                    int hp = sc.nextInt();
                    System.out.print("Type (1=Farm, 2=Industrial): ");
                    int type = sc.nextInt();

                    // Create the correct type based on input
                    Tractor t = (type == 1)
                        ? new FarmTractor(vin, age, registered, hp)
                        : new IndustrialTractor(vin, age, registered, hp);

                    // Try to add it
                    if (manager.addTractor(t)) {
                        System.out.println("Tractor added successfully.");
                    } else {
                        System.out.println("Max tractors reached.");
                    }
                    break;

                case 2:
                    // Delete a tractor by VIN
                    System.out.print("Enter VIN to delete: ");
                    vin = sc.next();
                    if (manager.deleteTractor(vin)) {
                        System.out.println("Tractor deleted.");
                    } else {
                        System.out.println("Not found.");
                    }
                    break;

                case 3:
                    // Find tractor by VIN
                    System.out.print("Enter VIN to find: ");
                    vin = sc.next();
                    Tractor found = manager.findTractor(vin);
                    if (found != null) {
                        System.out.println(found);
                    } else {
                        System.out.println("Not found.");
                    }
                    break;

                case 4:
                    // Show how many tractors are stored
                    System.out.println("Total tractors: " + manager.countTractors());
                    break;

                case 5:
                    // List them all
                    manager.listAllTractors();
                    break;

                case 6:
                    // List tractors sorted by VIN
                    manager.listTractorsByVin();
                    break;

                case 7:
                    // Run maintenance on every tractor
                    manager.performMaintenanceOnAll();
                    break;

                case 8:
                    // Quit the program
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}
