package com.emu.tests.java8.future;

import org.junit.jupiter.api.Test;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

/**
 * ref https://www.baeldung.com/java-completablefuture
 */
public class CompletableFutureTest {


    @Test
    void testCompletedFuture() throws ExecutionException, InterruptedException {
        Future <String> completableFuture =
                CompletableFuture.completedFuture("Hello");

        Thread.sleep(1000);
        String result = completableFuture.get();
        assertEquals("Hello", result);

    }


    @Test
    void testSupplyAsync() throws ExecutionException, InterruptedException {

        CompletableFuture <String> future
                = CompletableFuture.supplyAsync(() -> {

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            return "Hello";
        });


        assertEquals("Hello", future.get());

    }

    @Test
    void testThenApply() throws ExecutionException, InterruptedException {


        CompletableFuture <String> completableFuture
                = CompletableFuture.supplyAsync(() -> "Hello");

        CompletableFuture <String> future = completableFuture
                .thenApply(s -> s + " World");

        assertEquals("Hello World", future.get());

    }


    CompletableFuture <String> computeAnother(String s) {
        return CompletableFuture.supplyAsync(() -> {
            System.out.println(Thread.currentThread().getId());
            return "compose " + s;
        });
    }

    @Test
    void testThenCompose() throws ExecutionException, InterruptedException {

        CompletableFuture <String> completableFuture
                = CompletableFuture.supplyAsync(() -> {
            System.out.println(Thread.currentThread().getId());
            return "Hello";
        });

        CompletableFuture <String> future = completableFuture
                .thenCompose(this::computeAnother);

        assertEquals("compose Hello", future.get());
    }

    @Test
    void testThenAccept() throws ExecutionException, InterruptedException {
        CompletableFuture <String> completableFuture
                = CompletableFuture.supplyAsync(() -> "Hello");

        CompletableFuture <Void> future = completableFuture
                .thenAccept(s -> System.out.println("Computation returned: " + s));


        assertNull(future.get());
    }


    @Test
    void testThenCombine() throws ExecutionException, InterruptedException {
        CompletableFuture <String> completableFuture
                = CompletableFuture.supplyAsync(() -> "Hello")
                .thenCombine(CompletableFuture.supplyAsync(
                        () -> " World"), (s1, s2) -> (s1 + s2));

        assertEquals("Hello World", completableFuture.get());

    }


    @Test
    void testAllOf() throws ExecutionException, InterruptedException {
        CompletableFuture <String> future1
                = CompletableFuture.supplyAsync(() -> "Hello");
        CompletableFuture <String> future2
                = CompletableFuture.supplyAsync(() -> "Beautiful");
        CompletableFuture <String> future3
                = CompletableFuture.supplyAsync(() -> "World");

        CompletableFuture <Void> combinedFuture
                = CompletableFuture.allOf(future1, future2, future3);


        combinedFuture.get();

        assertTrue(future1.isDone());
        assertTrue(future2.isDone());
        assertTrue(future3.isDone());
    }

    @Test
    void testJoin() {

        CompletableFuture <String> future1
                = CompletableFuture.supplyAsync(() -> "Hello");
        CompletableFuture <String> future2
                = CompletableFuture.supplyAsync(() -> "Beautiful");
        CompletableFuture <String> future3
                = CompletableFuture.supplyAsync(() -> "World");

        String combined = Stream.of(future1, future2, future3)
                .map(CompletableFuture::join)
                .collect(Collectors.joining(" "));

        assertEquals("Hello Beautiful World", combined);
    }

    @Test
    void testThenApplyAsync() throws ExecutionException, InterruptedException {


        CompletableFuture <String> completableFuture
                = CompletableFuture.supplyAsync(() -> {
            System.out.println(Thread.currentThread().getId());
            return "Hello";

        });

        CompletableFuture <String> future = completableFuture
                .thenApplyAsync(s -> {
                    System.out.println(Thread.currentThread().getId());
                    return s + " World";
                });

        assertEquals("Hello World", future.get());

    }

    @Test
    void testThenApplyAsync2() throws ExecutionException, InterruptedException {


        CompletableFuture <String> completableFuture
                = CompletableFuture.supplyAsync(() -> {
            System.out.println(Thread.currentThread().getId());
            return "Hello";

        });

        CompletableFuture <String> future = completableFuture
                .thenApplyAsync(s -> {
                    System.out.println(Thread.currentThread().getId());
                    return s + " World";
                });

        assertEquals("Hello World", future.get());

    }

}
