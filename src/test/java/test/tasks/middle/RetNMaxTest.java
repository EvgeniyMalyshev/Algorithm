package test.tasks.middle;


import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RetNMaxTest {
    @Test
    public void testMultiply() {
        // Тестируемый класс
        RetNMax tester = new RetNMax();
        int[] arr = {0,1,-1,6,2,7,9,9,10};
        // Проверяемый метод
        assertEquals("array{0,1,-1,6,2,7,9,9,10} 1nd must be 10", 10, tester.retInt(arr, 1));
        assertEquals("array{0,1,-1,6,2,7,9,9,10} 2nd must be 9", 9, tester.retInt(arr, 2));
        assertEquals("array{0,1,-1,6,2,7,9,9,10} 3nd max must be 7", 7, tester.retInt(arr, 3));
        assertEquals("array{0,1,-1,6,2,7,9,9,10} 8nd max must be -1", -1, tester.retInt(arr, 8));

    }

}