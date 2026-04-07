import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class test {

    //  Exception when empty
    @Test
    void testSearch_ThrowsExceptionWhenEmpty() {
        String[] input = {};

        assertThrows(IllegalStateException.class, () ->
                Train_Consist_Management_App.safeSearch(input, "BG101")
        );
    }

    //  Allows search when data exists
    @Test
    void testSearch_AllowsSearchWhenDataExists() {
        String[] input = {"BG101","BG205"};

        assertDoesNotThrow(() ->
                Train_Consist_Management_App.safeSearch(input, "BG101")
        );
    }

    //  Found after validation
    @Test
    void testSearch_BogieFoundAfterValidation() {
        String[] input = {"BG101","BG205","BG309"};

        assertTrue(Train_Consist_Management_App.safeSearch(input, "BG205"));
    }

    //  Not found after validation
    @Test
    void testSearch_BogieNotFoundAfterValidation() {
        String[] input = {"BG101","BG205","BG309"};

        assertFalse(Train_Consist_Management_App.safeSearch(input, "BG999"));
    }

    //  Single element case
    @Test
    void testSearch_SingleElementValidCase() {
        String[] input = {"BG101"};

        assertTrue(Train_Consist_Management_App.safeSearch(input, "BG101"));
    }
}