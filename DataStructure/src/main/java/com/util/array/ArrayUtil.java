package com.util.array;

import java.util.ArrayList;

public interface ArrayUtil {

    static Integer[] numberToIntegerArray(Integer num) {
        if (num < 0)
            throw new UnsupportedOperationException("Can't operate");
        if (num == 0) {
            Integer[] array = new Integer[1];
            array[0] = num;
            return array;
        }
        ArrayList<Integer> list = new ArrayList<>();
        while (num != 0) {
            list.add(num % 10);
            num = num / 10;
        }
        Integer[] array = new Integer[list.size()];
        for (int i = 0; i < array.length; i++) {
            array[i] = list.get(array.length - 1 - i);
        }
        return array;
    }
}