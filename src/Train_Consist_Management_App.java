import java.util.*;

/**
 * UC20: Exception Handling During Search Operations
 */
public class Train_Consist_Management_App {

    // Testable method
    public static boolean safeSearch(String[] bogieIds, String key) {

        // ✅ FAIL-FAST VALIDATION
        if (bogieIds == null || bogieIds.length == 0) {
            throw new IllegalStateException("No bogies available in train. Cannot perform search.");
        }

        // 🔍 Normal search (linear for simplicity)
        for (String id : bogieIds) {
            if (id.equals(key)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println(" UC20: Exception Handling During Search ");
        System.out.println("=================================\n");

        String[] bogieIds = {}; // empty case
        String searchId = "BG101";

        try {
            boolean found = safeSearch(bogieIds, searchId);

            if (found) {
                System.out.println("Bogie found.");
            } else {
                System.out.println("Bogie NOT found.");
            }

        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nUC20 execution completed...");
    }
}

