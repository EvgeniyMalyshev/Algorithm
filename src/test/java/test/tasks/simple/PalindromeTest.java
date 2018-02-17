package test.tasks.simple;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.*;

public class PalindromeTest {
    @Test
    public void testMultiply() {
        // Тестируемый класс
        Palindrome tester = new Palindrome();
        String pal = "sum summus mus";
        String nPal = "test";

        assertEquals("sum summus mus", "sum summus mus is  Palindrom", tester.checkPalindrom(pal));
        assertEquals("test", "test.xml is not Palindrom", tester.checkPalindrom(nPal));
    }
}