package com.example.mylibrary;

import static org.assertj.core.api.Assertions.assertThat;

import com.example.testdata.TestUtils;

import org.junit.Test;

public class ReadingFileInModuleMyLibrary {

    @Test
    public void readsJson() {
        TestUtils utils = new TestUtils();

        String string = utils.convertToString("egis_json.json");

        assertThat(string).contains("egis_value");
    }
}
