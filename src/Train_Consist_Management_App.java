import java.util.ArrayList;
import java.util.List;

/**
 * UC1: Initialize Train and Display Consist Summary
 */
public class Train_Consist_Management_App {

    public static void main(String[] args) {

        // Welcome banner
        System.out.println("=================================");
        System.out.println("  Train Consist Management App  ");
        System.out.println("=================================\n");

        // Dynamic list to store bogies
        List<String> trainConsist = new ArrayList<>();

        // Initial state
        System.out.println("Train initialized successfully...");
        System.out.println("Initial bogie count: " + trainConsist.size());
    }
}