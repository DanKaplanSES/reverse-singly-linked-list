package org.tietyt.reverse_singly_linked_list;


public class ReverseAlgorithm {
    public static Node reverse(Node originalHead) {
        if (originalHead == null) {
            return null;
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

}
