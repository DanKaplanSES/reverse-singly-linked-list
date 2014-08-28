package org.tieTYT.reverseSinglyLinkedList;


import org.junit.Test;

import static junit.framework.TestCase.assertNull;
import static org.junit.Assert.assertEquals;

public class ReverseTest {


    @Test
    public void reversingNothingReturnsNull() {
        assertNull(Reverse.imperative(null));
    }

    @Test
    public void reversingOneElementReturnsItself() {
        assertEquals(new Node(1), Reverse.imperative(new Node(1)));
    }

    @Test
    public void reversingThreeElementsReturnsTheReverse() {
        assertEquals(new Node(3, new Node(2, new Node(1))), Reverse.imperative(new Node(1, new Node(2, new Node(3)))));
    }

    @Test
    public void reversingFourElementsReturnsTheReverse() {
        assertEquals(new Node(4, new Node(3, new Node(2, new Node(1)))), Reverse.imperative(new Node(1, new Node(2, new Node(3, new Node(4))))));
    }

}
