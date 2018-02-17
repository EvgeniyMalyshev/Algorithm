package test.tasks.simple;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.*;

public class SearchStringTest {
    @Test
    public void testMultiply() {
        // Тестируемый класс
        SearchString tester = new SearchString();
        String str = "search substring in string";
        String subStr = "search";
        String subStr2 = "test";
        // Проверяемый метод
        assertEquals("str has subStr", "The string HAS a substring", tester.find(subStr, str));
        assertEquals("str does have subStr2", "String does NOT have the substring", tester.find(subStr2, str));
    }
}