import java.util.*;

/**
 * UC14: Handle Invalid Bogie Capacity using Custom Exception
 */
public class Train_Consist_Management_App {

    // Custom Exception
    static class InvalidCapacityException extends Exception {
        public InvalidCapacityException(String message) {
            super(message);
        }
    }

    // Bogie class with validation
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) throws InvalidCapacityException {
            if (capacity <= 0) {
                throw new InvalidCapacityException("Capacity must be greater than zero");
            }
            this.name = name;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("  UC14: Handle Invalid Capacity ");
        System.out.println("=================================\n");

        try {
            // Valid bogie
            Bogie b1 = new Bogie("Sleeper", 72);
            System.out.println("Created Bogie: " + b1.name + " -> " + b1.capacity);

            // Invalid bogie
            Bogie b2 = new Bogie("AC Chair", -10);

        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nUC14 exception handling completed...");
    }
}

