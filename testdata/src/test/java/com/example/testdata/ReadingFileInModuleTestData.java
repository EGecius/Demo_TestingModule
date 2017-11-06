package com.example.testdata;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class ReadingFileInModuleTestData {

    @Test
    public void readsJson() {
        TestUtils utils = new TestUtils();

        String string = utils.convertToString("egis_json.json");
        
        assertThat(string).contains("egis_value");
    }

}