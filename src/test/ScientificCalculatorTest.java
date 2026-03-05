import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

public class ScientificCalculatorTest {

    // ── Square Root Tests ────────────────────────────────────────

    @Test
    @DisplayName("Square root of a positive number")
    void testSquareRootPositive() {
        assertEquals(5.0, ScientificCalculator.squareRoot(25.0), 1e-9);
    }

    @Test
    @DisplayName("Square root of zero")
    void testSquareRootZero() {
        assertEquals(0.0, ScientificCalculator.squareRoot(0.0), 1e-9);
    }

    @Test
    @DisplayName("Square root of a decimal number")
    void testSquareRootDecimal() {
        assertEquals(1.4142135623, ScientificCalculator.squareRoot(2.0), 1e-6);
    }

    @Test
    @DisplayName("Square root of a negative number returns NaN")
    void testSquareRootNegative() {
        assertTrue(Double.isNaN(ScientificCalculator.squareRoot(-4.0)));
    }

    // ── Factorial Tests ──────────────────────────────────────────

    @Test
    @DisplayName("Factorial of 0 is 1")
    void testFactorialZero() {
        assertEquals(1, ScientificCalculator.factorial(0));
    }

    @Test
    @DisplayName("Factorial of 1 is 1")
    void testFactorialOne() {
        assertEquals(1, ScientificCalculator.factorial(1));
    }

    @Test
    @DisplayName("Factorial of 5 is 120")
    void testFactorialFive() {
        assertEquals(120, ScientificCalculator.factorial(5));
    }

    @Test
    @DisplayName("Factorial of 10 is 3628800")
    void testFactorialTen() {
        assertEquals(3628800, ScientificCalculator.factorial(10));
    }

    @Test
    @DisplayName("Factorial of a negative number returns -1")
    void testFactorialNegative() {
        assertEquals(-1, ScientificCalculator.factorial(-3));
    }

    // ── Natural Logarithm Tests ──────────────────────────────────

    @Test
    @DisplayName("ln(1) = 0")
    void testNaturalLogOne() {
        assertEquals(0.0, ScientificCalculator.naturalLog(1.0), 1e-9);
    }

    @Test
    @DisplayName("ln(e) = 1")
    void testNaturalLogE() {
        assertEquals(1.0, ScientificCalculator.naturalLog(Math.E), 1e-9);
    }

    @Test
    @DisplayName("ln of a positive number")
    void testNaturalLogPositive() {
        assertEquals(2.302585, ScientificCalculator.naturalLog(10.0), 1e-5);
    }

    @Test
    @DisplayName("ln(0) returns NaN")
    void testNaturalLogZero() {
        assertTrue(Double.isNaN(ScientificCalculator.naturalLog(0.0)));
    }

    @Test
    @DisplayName("ln of negative number returns NaN")
    void testNaturalLogNegative() {
        assertTrue(Double.isNaN(ScientificCalculator.naturalLog(-5.0)));
    }

    // ── Power Function Tests ─────────────────────────────────────

    @Test
    @DisplayName("2^3 = 8")
    void testPowerPositiveExponent() {
        assertEquals(8.0, ScientificCalculator.power(2.0, 3.0), 1e-9);
    }

    @Test
    @DisplayName("5^0 = 1")
    void testPowerZeroExponent() {
        assertEquals(1.0, ScientificCalculator.power(5.0, 0.0), 1e-9);
    }

    @Test
    @DisplayName("2^-1 = 0.5")
    void testPowerNegativeExponent() {
        assertEquals(0.5, ScientificCalculator.power(2.0, -1.0), 1e-9);
    }

    @Test
    @DisplayName("9^0.5 = 3 (square root via power)")
    void testPowerFractionalExponent() {
        assertEquals(3.0, ScientificCalculator.power(9.0, 0.5), 1e-9);
    }

    @Test
    @DisplayName("0^5 = 0")
    void testPowerZeroBase() {
        assertEquals(0.0, ScientificCalculator.power(0.0, 5.0), 1e-9);
    }
}

