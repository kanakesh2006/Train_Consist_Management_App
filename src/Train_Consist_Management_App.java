import java.util.HashSet;
import java.util.Set;

/**
 * UC3: Track Unique Bogie IDs using HashSet
 */
public class Train_Consist_Management_App {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("  UC3: Track Unique Bogie IDs   ");
        System.out.println("=================================\n");

        // Create a Set to store unique bogie IDs
        Set<String> bogies = new HashSet<>();

        // Add bogie IDs (including duplicates)
        bogies.add("BG101");
        bogies.add("BG102");
        bogies.add("BG103");
        bogies.add("BG104");

        // Duplicate entries (will be ignored)
        bogies.add("BG101");
        bogies.add("BG102");

        // Display unique bogie IDs
        System.out.println("Bogie IDs After Insertion:");
        System.out.println(bogies);

        System.out.println("\nNote:");
        System.out.println("Duplicates are automatically ignored by HashSet.");

        System.out.println("\nUC3 uniqueness validation completed...");
    }
}