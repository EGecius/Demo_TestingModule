package com.example.mylibrary;

import static org.junit.Assert.assertEquals;

import android.support.test.runner.AndroidJUnit4;

import com.example.testdata.TestDataProviderTestDataModule;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Instrumented test, which will execute on an Android device.
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {

    @Ignore // does not compile because code is in unit test code
    @Test
    public void useAppContext() throws Exception {
//        String string = TestDataProviderLibrary.getString();
    }

    @Test
    public void getDataFromTestDataModule() {
        String name = TestDataProviderTestDataModule.getName();
        assertEquals("TestDataProviderTestDataModule", name);
    }
}
