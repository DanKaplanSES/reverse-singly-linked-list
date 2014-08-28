package org.tieTYT.reverseSinglyLinkedList;


public class ReverseAlgorithm {
    public static Node reverse(Node head) {
        if (head == null) {
            return null;
        }
        Node[] reversedArray = reversedArray(head);

        for (int i = 0; i < reversedArray.length - 1; i++) {
            Node first = reversedArray[i];
            Node second = reversedArray[i + 1];
            first.setNext(second);
        }

        reversedArray[reversedArray.length - 1].setNext(null);   //otherwise the new back of the list will still reference the reversed front.

        return reversedArray[0];
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
