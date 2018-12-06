package com.game.farmer.testing.digs;

import com.game.farmer.digs.BlueDig;
import org.junit.*;
import com.game.farmer.digs.Dig;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

public class DigsTestSuite {
    private static int testCounter;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Test
    public void ReturnRandomNumbersfrom1to12() {
        // Given
        Dig dig = new Dig();
        List<Integer> randomNumbers = new ArrayList<>();
        // When
        for (int i = 0; i <30 ; i++) {
            int randomNumber =dig.randomNumber();
            randomNumbers.add(randomNumber);
        }
        System.out.println(randomNumbers);

        // Then

        Assert.assertEquals(false, randomNumbers.contains(13));
        Assert.assertEquals(false, randomNumbers.contains(0));
    }
}
