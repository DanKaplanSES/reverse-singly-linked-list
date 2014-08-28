package org.tieTYT.reverseSinglyLinkedList;


import org.junit.Test;

import static junit.framework.TestCase.assertNull;
import static org.junit.Assert.assertEquals;

public class ReverseAlgorithmTest {


    @Test
    public void reversingNothingReturnsNull() {
        assertNull(ReverseAlgorithm.reverse(null));
    }

    @Test
    public void reversingOneElementReturnsItself() {
        assertEquals(new Node(1), ReverseAlgorithm.reverse(new Node(1)));
    }

    @Test
    public void reversingThreeElementsReturnsTheReverse() {
        assertEquals(new Node(3, new Node(2, new Node(1))), ReverseAlgorithm.reverse(new Node(1, new Node(2, new Node(3)))));
    }

    @Test
    public void reversingFourElementsReturnsTheReverse() {
        assertEquals(new Node(4, new Node(3, new Node(2, new Node(1)))), ReverseAlgorithm.reverse(new Node(1, new Node(2, new Node(3, new Node(4))))));
    }

}
