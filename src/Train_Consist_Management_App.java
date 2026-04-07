import java.util.*;

/**
 * UC17: Sort Bogie Names Using Arrays.sort()
 */
public class Train_Consist_Management_App {

    // Testable method
    public static String[] sortBogieNames(String[] bogies) {
        Arrays.sort(bogies); // built-in sorting
        return bogies;
    }

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println(" UC17: Sort Bogie Names ");
        System.out.println("=================================\n");

        String[] bogies = {"Sleeper", "AC Chair", "First Class", "General", "Luxury"};

        System.out.println("Original Bogie Names:");
        System.out.println(Arrays.toString(bogies));

        sortBogieNames(bogies);

        System.out.println("\nSorted Bogie Names (Alphabetical):");
        System.out.println(Arrays.toString(bogies));

        System.out.println("\nUC17 sorting completed...");
    }
}


