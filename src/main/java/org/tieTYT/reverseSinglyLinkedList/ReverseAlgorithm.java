package org.tieTYT.reverseSinglyLinkedList;


public class ReverseAlgorithm {
    public static Node reverse(Node head) {
        if (head == null) {
            return null;
        }
        if (head.getNext() == null) {
            return head;
        }

        Node lastFront = head;

        while (head.getNext() != null) {
            Node newFront = head.getNext();
            Node newRest = head.getNext().getNext();
            head.setNext(newRest);
            newFront.setNext(lastFront);
            lastFront = newFront;
        }
        return lastFront;
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
