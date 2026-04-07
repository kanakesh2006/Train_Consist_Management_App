import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class test {

    //  Found
    @Test
    void testBinarySearch_BogieFound() {
        String[] input = {"BG101","BG205","BG309","BG412","BG550"};

        assertTrue(Train_Consist_Management_App.binarySearch(input, "BG309"));
    }

    //  Not found
    @Test
    void testBinarySearch_BogieNotFound() {
        String[] input = {"BG101","BG205","BG309","BG412","BG550"};

        assertFalse(Train_Consist_Management_App.binarySearch(input, "BG999"));
    }

    //  First element
    @Test
    void testBinarySearch_FirstElementMatch() {
        String[] input = {"BG101","BG205","BG309"};

        assertTrue(Train_Consist_Management_App.binarySearch(input, "BG101"));
    }

    //  Last element
    @Test
    void testBinarySearch_LastElementMatch() {
        String[] input = {"BG101","BG205","BG309","BG412","BG550"};

        assertTrue(Train_Consist_Management_App.binarySearch(input, "BG550"));
    }

    //  Single element
    @Test
    void testBinarySearch_SingleElementArray() {
        String[] input = {"BG101"};

        assertTrue(Train_Consist_Management_App.binarySearch(input, "BG101"));
    }

    //  Empty array
    @Test
    void testBinarySearch_EmptyArray() {
        String[] input = {};

        assertFalse(Train_Consist_Management_App.binarySearch(input, "BG101"));
    }

    //  Unsorted input handled
    @Test
    void testBinarySearch_UnsortedInputHandled() {
        String[] input = {"BG309","BG101","BG550","BG205","BG412"};

        assertTrue(Train_Consist_Management_App.binarySearch(input, "BG205"));
    }
}