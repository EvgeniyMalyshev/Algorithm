package test.tasks.simple;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FactorClassTest {

    @Test
    public void testMultiply() {
        // Тестируемый класс
        FactorClass tester = new FactorClass();
        String t = "25648";

        // Проверяемый метод
        assertEquals("25648 = 2*2*2*2*7*229", "Простые множители числа 25648: 2, 2, 2, 2, 7, 229", tester.factorFunc(t));
    }
}