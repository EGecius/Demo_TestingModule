package com.example.mylibrary;

import static org.junit.Assert.assertEquals;

import com.example.testdata.TestDataProviderTestDataModule;

import org.junit.Test;

/**
 * Example local unit test, which will execute on the development machine (host).
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    @Test
    public void getDataFromTestDataModule() {
        String name = TestDataProviderTestDataModule.getName();
        assertEquals("TestDataProviderTestDataModule", name);
    }
}