import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

//import static org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    @DisplayName("addition")
    void add(){
        Calculator calc = new Calculator();
        assertEquals(5, calc.add(2,3), "2+3 should be 5");
    }

    @Test
    @DisplayName("Subtraction: 8-3 = 5")
    void dec(){
        Calculator calc = new Calculator();
        assertEquals(5, calc.dec(8,3), "8-3 should be 5");
    }

    @Test
    @DisplayName("multiplication: 3*5 = 15")
    void mult(){
        Calculator calc = new Calculator();
        assertEquals(15, calc.mult(3,5), "3*5 should be 15");
    }

    @Test
    @DisplayName("Division: 10/2 = 5")
    void div(){
        Calculator calc = new Calculator();
        assertEquals(5, calc.div(10,2), "10/2 should be 5");
    }



}