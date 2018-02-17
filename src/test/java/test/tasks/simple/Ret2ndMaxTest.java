package test.tasks.simple;


import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.assertEquals;

class Ret2ndMaxTest {
    @Test
    public void testMultiply() {
        // Тестируемый класс
        Ret2ndMax tester = new Ret2ndMax();
        int[] arr = {-2,12,30,30,12};

        // Проверяемый метод
        assertEquals("array{-2,12,30,30,12} must be 12", 12, tester.retInt(arr));
    }
}