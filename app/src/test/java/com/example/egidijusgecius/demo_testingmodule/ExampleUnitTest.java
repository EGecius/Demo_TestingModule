package com.example.egidijusgecius.demo_testingmodule;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

/**
 * Example local unit test, which will execute on the development machine (host).
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Ignore // this does not compile because class is in another modules' test code
    @Test
    public void getDataFromLibrary() {
//        String string = TestDataProviderLibary.getString();
//        assertEquals(string, "s");

    }
}