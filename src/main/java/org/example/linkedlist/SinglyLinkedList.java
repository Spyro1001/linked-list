package org.example.linkedlist;

public class SinglyLinkedList<E> implements LinkedList<E> {

    private Node head;
    private Node tail;

    public SinglyLinkedList() {
        head = null;
        tail = null;
    }

    @Override
    public void addFirst(E element) {

        Node newNode = new Node(element, head);

        if(head == null) {
            head = newNode;
            tail = head;
        } else {
            head = newNode;
        }

    }

    @Override
    public void addLast(E element) {

        Node newNode = new Node(element, null);

        if(head == null) {
            tail = newNode;
            head = tail;
        } else {
            tail = newNode;
        }
    }

    @Override
    public E pollFirst() {
        return null;
    }

    @Override
    public E pollLast() {
        return null;
    }

    @Override
    public E peekFirst() {
        return null;
    }

    @Override
    public E peekLast() {
        return null;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean contains(E element) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    private class Node {

        E element;
        Node next;

        public Node(E element, Node next) {
            this.element = element;
            this.next = next;
        }
    }
}
