package org.tieTYT.reverseSinglyLinkedList;


public class ReverseAlgorithm {
    public static Node reverse(Node originalHead) {
        if (originalHead == null) {
            return null;
        }
        if (originalHead.getNext() == null) {
            return originalHead;
        }

        Node frontFromLastIteration = originalHead;

        while (originalHead.getNext() != null) {
            Node newFront = originalHead.getNext();
            Node newRest = originalHead.getNext().getNext();
            originalHead.setNext(newRest);
            newFront.setNext(frontFromLastIteration);
            frontFromLastIteration = newFront;
        }
        return frontFromLastIteration;
    }



    private static Node[] reversedArray(Node head) {
        int size = getListSize(head);

        Node [] toBeReversed = new Node[size];

        Node current = head;
        for (int i = size - 1; i >= 0; i--) {
            toBeReversed[i] = current;
            current = current.getNext();
        }
        return toBeReversed;
    }

    private static int getListSize(Node head) {
        int size = 0;
        Node next = head;
        while (next != null) {
            next = next.getNext();
            size++;
        }
        return size;
    }
}
