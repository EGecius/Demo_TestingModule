package com.example.egidijusgecius.demo_testingmodule;

import static org.junit.Assert.assertEquals;

import com.example.testdata.TestDataProviderTestDataModule;

import org.junit.Ignore;
import org.junit.Test;

/**
 * Example local unit test, which will execute on the development machine (host).
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    @Ignore // this does not compile because class is in another modules' test code
    @Test
    public void getDataFromLibrary() {
//        String string = TestDataProviderLibrary.getString();
//        assertEquals(string, "s");
    }

    @Test
    public void getDataFromTestDataModule() {
        String name = TestDataProviderTestDataModule.getName();
        assertEquals("TestDataProviderTestDataModule", name);
    }
}