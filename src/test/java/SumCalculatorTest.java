import org.calculator.SumCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SumCalculatorTest {
    private SumCalculator sumCalculator;

    @BeforeEach
    public void setUp(){
        sumCalculator=new SumCalculator();
    }
    @Test
    public void testSumWithOne(){
        int result = sumCalculator.sum(1);
        assertEquals(1, result);
    }
    @Test
    public void testSumWithMoreThenOne(){
        int result = sumCalculator.sum(3);
        assertEquals(6,result);
    }

@Test
public void testSumWithZero(){
    assertThrows(IllegalArgumentException.class, () -> {
        SumCalculator.sum(0);
    });
}

}
