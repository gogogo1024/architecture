package com.example.demo;

import com.example.demo.future.MultithreadedMaxFinder;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.concurrent.ExecutionException;

@SpringBootTest
public class FutureTests {
    @Test
    void splitTaskFutureTest() throws ExecutionException, InterruptedException {
        MultithreadedMaxFinder multithreadedMaxFinder = new MultithreadedMaxFinder();
        int[] numbers = new int[]{1, 2, 3, 9, 8, 4, 6,};
        int max = multithreadedMaxFinder.max(numbers);
        System.out.println(max);
    }
}
