import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class test {

    // Basic alphabetical sorting
    @Test
    void testSort_BasicAlphabeticalSorting() {
        String[] input = {"Sleeper","AC Chair","First Class","General","Luxury"};
        String[] expected = {"AC Chair","First Class","General","Luxury","Sleeper"};

        String[] result = Train_Consist_Management_App.sortBogieNames(input);

        assertArrayEquals(expected, result);
    }

    // Unsorted input
    @Test
    void testSort_UnsortedInput() {
        String[] input = {"Luxury","General","Sleeper","AC Chair"};
        String[] expected = {"AC Chair","General","Luxury","Sleeper"};

        String[] result = Train_Consist_Management_App.sortBogieNames(input);

        assertArrayEquals(expected, result);
    }

    // Already sorted
    @Test
    void testSort_AlreadySortedArray() {
        String[] input = {"AC Chair","First Class","General"};
        String[] expected = {"AC Chair","First Class","General"};

        String[] result = Train_Consist_Management_App.sortBogieNames(input);

        assertArrayEquals(expected, result);
    }

    // Duplicate names
    @Test
    void testSort_DuplicateBogieNames() {
        String[] input = {"Sleeper","AC Chair","Sleeper","General"};
        String[] expected = {"AC Chair","General","Sleeper","Sleeper"};

        String[] result = Train_Consist_Management_App.sortBogieNames(input);

        assertArrayEquals(expected, result);
    }

    // Single element
    @Test
    void testSort_SingleElementArray() {
        String[] input = {"Sleeper"};
        String[] expected = {"Sleeper"};

        String[] result = Train_Consist_Management_App.sortBogieNames(input);

        assertArrayEquals(expected, result);
    }
}