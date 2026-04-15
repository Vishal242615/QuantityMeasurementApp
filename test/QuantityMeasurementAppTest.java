import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuantityMeasurementAppTest {

    // Test 1: Same value
    @Test
    void testEquality_SameValue() {
        QuantityMeasurementApp.Feet f1 = new QuantityMeasurementApp.Feet(1.0);
        QuantityMeasurementApp.Feet f2 = new QuantityMeasurementApp.Feet(1.0);

        assertEquals(f1, f2, "1.0 ft should be equal to 1.0 ft");
    }

    // Test 2: Different value
    @Test
    void testEquality_DifferentValue() {
        QuantityMeasurementApp.Feet f1 = new QuantityMeasurementApp.Feet(1.0);
        QuantityMeasurementApp.Feet f2 = new QuantityMeasurementApp.Feet(2.0);

        assertNotEquals(f1, f2, "1.0 ft should not be equal to 2.0 ft");
    }

    // Test 3: Null comparison
    @Test
    void testEquality_NullComparison() {
        QuantityMeasurementApp.Feet f1 = new QuantityMeasurementApp.Feet(1.0);

        assertNotEquals(null, f1, "Value should not be equal to null");
    }

    // Test 4: Non-numeric input (different type)
    @Test
    void testEquality_NonNumericInput() {
        QuantityMeasurementApp.Feet f1 = new QuantityMeasurementApp.Feet(1.0);
        String nonNumeric = "test";

        assertNotEquals(f1, nonNumeric, "Feet should not be equal to non-numeric type");
    }

    // Test 5: Same reference (Reflexive property)
    @Test
    void testEquality_SameReference() {
        QuantityMeasurementApp.Feet f1 = new QuantityMeasurementApp.Feet(1.0);

        assertEquals(f1, f1, "Object should be equal to itself");
    }
}