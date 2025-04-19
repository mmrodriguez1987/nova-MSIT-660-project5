import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

    // Test Case 01: Valid string should be stored correctly
    @Test
    public void testConstructor_ValidString_ShouldStoreCorrectly() {
        StringUtils util = new StringUtils("abc");
        assertEquals("abc", util.getMyStr());
    }

    // Test Case 02: Constructor should reject null input (expects NullPointerException)
    @Test
    public void testConstructor_NullInput_ShouldThrowNullPointerException() {
        Exception exception = assertThrows(NullPointerException.class, () -> new StringUtils(null, true));
        assertEquals("Parameter cannot be null", exception.getMessage());
    }

    // Test Case 03: Constructor should reject empty string (expects NullPointerException)
    @Test
    public void testConstructor_EmptyInput_ShouldThrowNullPointerException() {
        Exception exception = assertThrows(NullPointerException.class, () -> new StringUtils("", true));
        assertEquals("Parameter cannot be null", exception.getMessage());
    }

    // Test Case 04: Two-arg constructor with 'true' should store uppercase
    @Test
    public void testConstructor_TwoArgs_UpperTrue_ShouldStoreUppercase() {
        StringUtils util = new StringUtils("abc", true);
        assertEquals("ABC", util.getMyStr());
    }

    // Test Case 05: Two-arg constructor with 'false' should store lowercase
    @Test
    public void testConstructor_TwoArgs_UpperFalse_ShouldStoreLowercase() {
        StringUtils util = new StringUtils("ABC", false);
        assertEquals("abc", util.getMyStr());
    }

    // Test Case 06: Two-arg constructor should reject empty string input
    @Test
    public void testConstructor_TwoArgs_EmptyInput_ShouldThrowNullPointerException() {
        Exception exception = assertThrows(NullPointerException.class, () -> new StringUtils("", true));
        assertEquals("Parameter cannot be null", exception.getMessage());
    }

    // Test Case 07: convertToUpperCase should convert whole string, not skip first char
    @Test
    public void testConvertToUpperCase_ShouldReturnAllUppercase() {
        StringUtils util = new StringUtils("abc");
        String result = util.convertToUpperCase();
        assertEquals("ABC", result); // This will fail with current code (it returns "BC")
    }

    // Test Case 08: updateToConcat should append string and update internal value
    @Test
    public void testUpdateToConcat_ShouldAppendCorrectly() {
        StringUtils util = new StringUtils("hi");
        String result = util.updateToConcat("there");
        assertEquals("hithere", result);
        assertEquals("hithere", util.getMyStr());
    }
}
