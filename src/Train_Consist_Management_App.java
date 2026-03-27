import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * UC7: Sort Bogies by Capacity using Comparator
 */
public class Train_Consist_Management_App {

    // Bogie class
    static class Bogie {
        String name;
        int capacity;

        public Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        public void display() {
            System.out.println(name + " -> " + capacity);
        }
    }

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("  UC7: Sort Bogies by Capacity ");
        System.out.println("=================================\n");

        // Create list of bogies
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("General", 90));

        // Before sorting
        System.out.println("Before Sorting:");
        for (Bogie b : bogies) {
            b.display();
        }

        // Sort using Comparator (ascending by capacity)
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        // After sorting
        System.out.println("\nAfter Sorting by Capacity:");
        for (Bogie b : bogies) {
            b.display();
        }

        System.out.println("\nUC7 sorting completed...");
    }
}