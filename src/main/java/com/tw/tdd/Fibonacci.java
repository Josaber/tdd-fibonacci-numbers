package com.tw.tdd;

import java.util.stream.Stream;

public class Fibonacci {
    public static long calculate(int index) {
        if(index > 50)
            throw new IllegalArgumentException();
        return Stream.iterate(new long[]{0, 1}, t -> new long[]{t[1], t[0] + t[1]})
                .limit(index)
                .reduce((first, second) -> second)
                .map(arr -> arr[1])
                .orElseThrow(IllegalArgumentException::new);
    }
}
