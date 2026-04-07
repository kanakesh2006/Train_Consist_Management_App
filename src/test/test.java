import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class test {

    // Test 1: Safe cargo assignment
    @Test
    void testCargo_SafeAssignment() {
        Train_Consist_Management_App.GoodsBogie bogie =
                new Train_Consist_Management_App.GoodsBogie("Cylindrical");

        bogie.assignCargo("Petroleum");

        assertEquals("Petroleum", bogie.cargo);
    }

    // Test 2: Unsafe cargo handled
    @Test
    void testCargo_UnsafeAssignmentHandled() {
        Train_Consist_Management_App.GoodsBogie bogie =
                new Train_Consist_Management_App.GoodsBogie("Rectangular");

        bogie.assignCargo("Petroleum");

        assertNull(bogie.cargo); // cargo should not be assigned
    }

    // Test 3: Cargo not assigned after failure
    @Test
    void testCargo_CargoNotAssignedAfterFailure() {
        Train_Consist_Management_App.GoodsBogie bogie =
                new Train_Consist_Management_App.GoodsBogie("Rectangular");

        bogie.assignCargo("Petroleum");

        assertNotEquals("Petroleum", bogie.cargo);
    }

    // Test 4: Program continues after exception
    @Test
    void testCargo_ProgramContinuesAfterException() {
        Train_Consist_Management_App.GoodsBogie b1 =
                new Train_Consist_Management_App.GoodsBogie("Rectangular");

        Train_Consist_Management_App.GoodsBogie b2 =
                new Train_Consist_Management_App.GoodsBogie("Cylindrical");

        b1.assignCargo("Petroleum"); // fails
        b2.assignCargo("Coal");      // should still work

        assertEquals("Coal", b2.cargo);
    }

    // Test 5: Finally block execution (indirect check)
    @Test
    void testCargo_FinallyBlockExecution() {
        Train_Consist_Management_App.GoodsBogie bogie =
                new Train_Consist_Management_App.GoodsBogie("Rectangular");

        // No exception should crash program
        assertDoesNotThrow(() -> bogie.assignCargo("Petroleum"));
    }
}