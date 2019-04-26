package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {
    Logger logger;

    @Test
    public void testLog() {
        //Given
        String log = "test";
        //When
        Logger.getInstance().log(log);
        //Then
        Assert.assertEquals(log, Logger.getInstance().getLastLog());
    }
}
