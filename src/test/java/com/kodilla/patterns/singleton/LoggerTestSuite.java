package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {
    @Test
    public void testGetLastLog() {
        //Given
        String inputText = "myText";
        //When
        Logger.getInstance().log(inputText);
        //Then
        Assert.assertEquals(inputText, Logger.getInstance().getLastLog());
    }
}
