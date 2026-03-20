import java.util.HashMap;
import java.util.Map;

/**
 * UC6: Map Bogie to Capacity using HashMap
 */
public class Train_Consist_Management_App {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("  UC6: Map Bogie to Capacity ");
        System.out.println("=================================\n");

        // Create HashMap for bogie → capacity
        Map<String, Integer> bogieCapacity = new HashMap<>();

        // Insert bogie-capacity mappings
        bogieCapacity.put("First Class", 24);
        bogieCapacity.put("Cargo", 120);
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 56);

        // Display capacity details
        System.out.println("Bogie Capacity Details:\n");

        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("\nUC6 bogie-capacity mapping completed...");
    }
}