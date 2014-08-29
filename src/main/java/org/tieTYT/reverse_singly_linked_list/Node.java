package org.tietyt.reverse_singly_linked_list;


public class Node {

    private Node next;
    private int value;  //this could be any object.  Choosing int for convenience.

    public Node(int value, Node next) {
        this.next = next;
        this.value = value;
    }

    public Node(int value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Node node = (Node) o;

        if (value != node.value) return false;
        if (next != null ? !next.equals(node.next) : node.next != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = next != null ? next.hashCode() : 0;
        result = 31 * result + value;
        return result;
    }

    @Override
    public String toString() {
        return "(" +
                "value=" + value +
                ", next=" + next +
                ')';
    }
}
