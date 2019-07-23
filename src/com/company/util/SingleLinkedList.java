package com.company.util;

public class SingleLinkedList<T> {
    private Node head;
    private int length;

    public SingleLinkedList() {
        head = null;
        length = 0;
    }

    public void add(T data) {
        Node newNode = new Node();
        newNode.setData(data);
        newNode.setNext(null);
        if (this.head == null) {
            this.head = new Node();
            this.head.setNext(newNode);
        } else {
            Node prevNode = this.head;
            for (int i = 0; i < length; i++) {
                prevNode = prevNode.next;
            }
            prevNode.setNext(newNode);
        }
        length++;
    }

    public void add(int index, T data) {
        Node newNode = new Node();
        newNode.setData(data);
        newNode.setNext(null);
        if (index == 0) {
            if (this.head == null) {
                this.head = new Node();
                this.head.setNext(newNode);
            } else {
                newNode.setNext(this.head.getNext());
                this.head.setNext(newNode);
            }
        } else {
            if (index < 0 || index > this.length - 1) {
                throw new IndexOutOfBoundsException();
            }
            Node prevNode = this.head;
            for (int i = 0; i < index; i++) {
                prevNode = prevNode.getNext();
            }
            newNode.setNext(prevNode.getNext());
            prevNode.setNext(newNode);
        }
        length++;
    }

    public void remove(int index) {
        if (this.head == null) return;
        Node prevNode = this.head;
        if (index < 0 || index > this.length - 1) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            prevNode.setNext(prevNode.getNext().getNext());
        } else {
            for (int i = 0; i < index; i++) {
                prevNode = prevNode.getNext();
            }
            prevNode.setNext(prevNode.getNext().getNext());
        }
        this.length--;
    }

    public T get(int index) {
        Node prevNode = this.head;
        for (int i = 0; i < index; i++) {
            prevNode = prevNode.getNext();
        }
        return prevNode.getNext().getData();
    }

    public int length() {
        return length;
    }

    private class Node {
        private T data;
        private Node next;

        public Node() {
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
