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

    // Testable method
    public static int getTotalCapacity(List<Bogie> bogies) {
        return bogies.stream()
                .map(b -> b.capacity)          // extract capacity
                .reduce(0, Integer::sum);     // sum all values
    }

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("  UC10: Count Total Seats ");
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
        int total = getTotalCapacity(bogies);

        // Display result
        System.out.println("\nTotal Seating Capacity: " + total);

        System.out.println("\nUC10 aggregation completed...");
    }
}

