import java.util.*;
import java.util.stream.*;

/**
 * UC10: Count Total Seats in Train using reduce()
 */
public class Train_Consist_Management_App {

    // Bogie class
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }
    }

    // Method to calculate total capacity (TESTABLE)
    public static int calculateTotalCapacity(List<Bogie> bogies) {
        return bogies.stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);
    }

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("  UC10: Total Train Capacity ");
        System.out.println("=================================\n");

        // Create bogie list
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("General", 90));

        // Display bogies
        System.out.println("Bogies:");
        for (Bogie b : bogies) {
            System.out.println(b.name + " -> " + b.capacity);
        }

        // Calculate total capacity
        int total = calculateTotalCapacity(bogies);

        // Display result
        System.out.println("\nTotal Seating Capacity: " + total);

        System.out.println("\nUC10 aggregation completed...");
    }
}

