package com.questions.linkedlist.singly;

import com.ds.linkedlist.singly.LinkedList;
import com.util.array.ArrayUtil;
import com.util.linkedlist.LinkedListUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class AddTwoNumbersUsingLinkedListTest {
    private AddTwoNumbersUsingLinkedList subject;

    @BeforeEach
    void setUp() {
        subject = new AddTwoNumbersUsingLinkedList();
    }


    @Test
    public void testAddTwoNumbers() {
        for (TestCase testcase : getTestCases()) {
            LinkedList<Integer> first = ArrayUtil.toLinkedList(testcase.first);
            LinkedList<Integer> second = ArrayUtil.toLinkedList(testcase.second);
            LinkedList<Integer> result = subject.addTwoNumbers(first, second);
            System.out.println("------");
            System.out.println("first- " + first);
            System.out.println("second- " + second);
            System.out.println("result- " + result);
            Assertions.assertArrayEquals(testcase.result, LinkedListUtil.toArray(result));
        }
    }

    private ArrayList<TestCase> getTestCases() {
        ArrayList<TestCase> testCases = new ArrayList<>();
        testCases.add(new TestCase(new Integer[]{9, 9, 9, 9, 9, 9, 9}, new Integer[]{9, 9, 9, 9}, new Integer[]{1, 0, 0, 0, 9, 9, 9, 8}));
        testCases.add(new TestCase(new Integer[]{2, 4, 3}, new Integer[]{5, 6, 4}, new Integer[]{8, 0, 7}));
        testCases.add(new TestCase(new Integer[]{0}, new Integer[]{0}, new Integer[]{0}));
        return testCases;
    }

    static class TestCase {
        Integer[] first;
        Integer[] second;
        Integer[] result;

        public TestCase(Integer[] first, Integer[] second, Integer[] result) {
            this.first = first;
            this.second = second;
            this.result = result;
        }

    }
}