package com.questions.linkedlist.singly;

import com.ds.linkedlist.singly.LinkedList;
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
            LinkedList<Integer> first = LinkedListUtil.numberToLinkedList(testcase.first);
            LinkedList<Integer> second = LinkedListUtil.numberToLinkedList(testcase.second);
            LinkedList<Integer> result = subject.addTwoNumbers(first, second);
            System.out.println("---   AddTwoNumbersUsingLinkedListTest   ---");
            System.out.println("first- " + first);
            System.out.println("second- " + second);
            System.out.println("result- " + result);
            Assertions.assertEquals(testcase.result, LinkedListUtil.linkedListToNumber(result));
        }
    }

    private ArrayList<TestCase> getTestCases() {
        ArrayList<TestCase> testCases = new ArrayList<>();
        testCases.add(new TestCase(9999999, 9999));
        testCases.add(new TestCase(243, 564));
        testCases.add(new TestCase(0, 0));
        return testCases;
    }

    static class TestCase {
        Integer first;
        Integer second;
        Integer result;

        public TestCase(Integer first, Integer second) {
            this.first = first;
            this.second = second;
            this.result = first + second;
        }
    }
}