import java.util.LinkedHashSet;
import java.util.Set;

/**
 * UC5: Preserve Insertion Order of Bogies using LinkedHashSet
 */
public class Train_Consist_Management_App {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("  UC5: Preserve Insertion Order of Bogies ");
        System.out.println("=================================\n");

        // Create LinkedHashSet to maintain order + uniqueness
        Set<String> trainFormation = new LinkedHashSet<>();

        // Add bogies
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Attempt duplicate insertion
        trainFormation.add("Sleeper"); // will be ignored

        // Display final formation
        System.out.println("Final Train Formation:");
        System.out.println(trainFormation);

        System.out.println("\nNote:");
        System.out.println("LinkedHashSet preserves insertion order and removes duplicates automatically.");

        System.out.println("\nUC5 formation setup completed...");
    }
}