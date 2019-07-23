package com.company.util;

public class DoubleLinkedList<T> {
    private Node head;
    private int length;

    public DoubleLinkedList() {
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
            Node currentNode = prevNode.getNext();
            newNode.setNext(currentNode);
            if (currentNode != null) {
                currentNode.setPrev(newNode);
            }
            newNode.setPrev(prevNode);
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
                Node currentNode = this.head.getNext();
                if (currentNode != null) {
                    currentNode.setPrev(newNode);
                }
                newNode.setNext(currentNode);
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
            Node currentNode = prevNode.getNext();
            newNode.setNext(currentNode);
            if (currentNode != null) {
                currentNode.setPrev(newNode);
            }
            newNode.setPrev(prevNode);
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
            prevNode.getNext().setPrev(null);
        } else {
            for (int i = 0; i < index; i++) {
                prevNode = prevNode.getNext();
            }
            Node currentNode = prevNode.getNext();
            Node nextNode = currentNode.getNext();
            prevNode.setNext(nextNode);
            if(nextNode != null){
                nextNode.setPrev(prevNode);
            }
            currentNode = null;
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
        private Node prev;
        private Node next;

        public Node() {
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Node getPrev() {
            return prev;
        }

        public void setPrev(Node prev) {
            this.prev = prev;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
