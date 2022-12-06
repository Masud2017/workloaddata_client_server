package org.workload.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class TestEnvironment {
    private Environment env;

    public TestEnvironment() throws IOException {
        this.env = new Environment();
    }
    @Test
    public void testGetValue() {
        String expectedValue = "4443";
        String value = this.env.getValue("server.port");

        Assertions.assertEquals(expectedValue,value);
    }

    @Test
    public void testSetValue() {
        String expectedValue = "testValue";
        this.env.setValue("test",expectedValue);
        String value = this.env.getValue("test");

        Assertions.assertEquals(expectedValue,value);
    }
}
