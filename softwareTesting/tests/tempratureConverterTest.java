import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class tempratureConverterTest {


    @Test
    void celsiusToFarenheit() {
        tempratureConverter m = new tempratureConverter();
        assertEquals(32.0, m.celsiusToFarenheit(0));


    }

    @Test
    void farenheitToCelsius() {
        tempratureConverter m = new tempratureConverter();
        assertEquals(0.0, m.farenheitToCelsius(32.0));
    }
}