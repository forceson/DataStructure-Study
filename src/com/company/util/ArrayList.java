package com.company.util;

public class ArrayList<T> {
    private final static int DEFAULT_CAPACITY = 10;
    private Object[] data;
    private int length;

    public ArrayList() {
        this.length = 0;
        data = new Object[DEFAULT_CAPACITY];
    }

    public ArrayList(int size) {
        this.length = 0;
        data = new Object[size];
    }

    public void add(T data) {
        int size = this.data.length;

        if (this.length == size) {
            grow(data, size);
        } else {
            this.data[length] = data;
        }
        this.length++;
    }

    public void add(int index, T data) {
        int size = this.data.length;

        if (this.length == size) {
            growWithIndex(data, length, index);
        } else {
            for (int i = this.length - 1; i > index - 1; i--) {
                this.data[i + 1] = this.data[i];
            }
            this.data[index] = data;
        }
        length++;
    }

    public void remove() {
        if (this.length == 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        this.data[this.length - 1] = null;
        this.length--;
    }

    public void remove(int index) {
        if (this.length == 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        this.data[index] = null;
        for (int i = index; i < this.length - 1; i++) {
            this.data[i] = this.data[i + 1];
        }
        this.length--;
    }

    public T get(int index) {
        return (T) this.data[index];
    }

    private void grow(T data, int size) {
        int newSize = size + 1;
        Object[] newArray = new Object[newSize];

        for (int i = 0; i < size; i++) {
            newArray[i] = this.data[i];
        }
        newArray[newSize - 1] = data;
        this.data = new Object[newSize];
        for (int i = 0; i < newSize; i++) {
            this.data[i] = newArray[i];
        }
    }

    private void growWithIndex(T data, int size, int index) {
        int newSize = size + 1;
        Object[] newArray = new Object[newSize];

        for (int i = 0; i < index; i++) {
            newArray[i] = this.data[i];
        }
        for (int i = index; i < size; i++) {
            newArray[i + 1] = this.data[i];
        }
        newArray[index] = data;
        this.data = new Object[newSize];
        for (int i = 0; i < newSize; i++) {
            this.data[i] = newArray[i];
        }
    }

    public int length() {
        return this.length;
    }
}
