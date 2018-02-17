package test.tasks.middle;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class CodingStringTest {
    @Test
    public void testMultiply() {
        // Тестируемый класс
        CodingString tester = new CodingString();
        String test = "test";
        String test2 = "uuurergeeerrq";
        String test3 = "p";
        String test4 = " ";
        // Проверяемый метод
        assertEquals("test.xml -> 1t1e1s1t", "1t1e1s1t", tester.encoding(test));
        // assertEquals("uuurergeeerrq -> 3u1r1e1r1g3e2r1q", "3u1r1e1r1g3e2r1q", tester.eCodFunc(test2));
        //assertEquals("p -> 1p", "1p", tester.eCodFunc(test3));
        //assertEquals("  -> ", "", tester.eCodFunc(test4));

    }

}