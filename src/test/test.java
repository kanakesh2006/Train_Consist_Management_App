import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class test {

    // Bogie found
    @Test
    void testSearch_BogieFound() {
        String[] input = {"BG101","BG205","BG309","BG412","BG550"};

        boolean result = Train_Consist_Management_App.linearSearch(input, "BG309");

        assertTrue(result);
    }

    // Bogie not found
    @Test
    void testSearch_BogieNotFound() {
        String[] input = {"BG101","BG205","BG309","BG412","BG550"};

        boolean result = Train_Consist_Management_App.linearSearch(input, "BG999");

        assertFalse(result);
    }

    // First element match
    @Test
    void testSearch_FirstElementMatch() {
        String[] input = {"BG101","BG205","BG309"};

        boolean result = Train_Consist_Management_App.linearSearch(input, "BG101");

        assertTrue(result);
    }

    // Last element match
    @Test
    void testSearch_LastElementMatch() {
        String[] input = {"BG101","BG205","BG309","BG412","BG550"};

        boolean result = Train_Consist_Management_App.linearSearch(input, "BG550");

        assertTrue(result);
    }

    // Single element array
    @Test
    void testSearch_SingleElementArray() {
        String[] input = {"BG101"};

        boolean result = Train_Consist_Management_App.linearSearch(input, "BG101");

        assertTrue(result);
    }
}