package org.rd.lessons.Lesson14;

import java.util.Arrays;
import java.util.List;

public class Stream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int itemToFind = 3;

        int result = findItem(numbers, itemToFind);
        System.out.println("Result: " + result);
    }

    public static int findItem(List<Integer> list, int item) {
        return list.stream()
                .filter(i -> i == item)
                .findFirst().orElse(-1);
    }
}
