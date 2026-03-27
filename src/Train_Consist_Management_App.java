import java.util.*;
import java.util.stream.*;

/**
 * UC12: Safety Compliance Check for Goods Bogies
 */
public class Train_Consist_Management_App {

    // Goods Bogie class
    static class GoodsBogie {
        String type;
        String cargo;

        GoodsBogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }
    }

    // Testable method for safety validation
    public static boolean isSafe(List<GoodsBogie> bogies) {
        return bogies.stream()
                .allMatch(b ->
                        // Rule: Cylindrical → only Petroleum allowed
                        !b.type.equals("Cylindrical") || b.cargo.equals("Petroleum")
                );
    }

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("  UC12: Safety Compliance Check ");
        System.out.println("=================================\n");

        // Create goods bogies
        List<GoodsBogie> goodsBogies = new ArrayList<>();

        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsBogies.add(new GoodsBogie("Open", "Coal"));
        goodsBogies.add(new GoodsBogie("Box", "Grain"));
        goodsBogies.add(new GoodsBogie("Cylindrical", "Coal")); // INVALID

        // Display bogies
        System.out.println("Goods Bogies in Train:");
        for (GoodsBogie b : goodsBogies) {
            System.out.println(b.type + " -> " + b.cargo);
        }

        // Check safety
        boolean safe = isSafe(goodsBogies);

        System.out.println("\nSafety Compliance Status: " + safe);

        if (!safe) {
            System.out.println("Train formation is NOT SAFE.");
        } else {
            System.out.println("Train formation is SAFE.");
        }

        System.out.println("\nUC12 safety validation completed...");
    }
}

