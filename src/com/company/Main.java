package com.company;

import com.company.util.ArrayList;
import com.company.util.CircularLinkedList;
import com.company.util.DoubleLinkedList;
import com.company.util.SingleLinkedList;

public class Main {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        // write your code here
        System.out.println("ArrayList");
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            arrayList.add("hi");
        }
        System.out.println(String.format("Time For Adding: %d", System.currentTimeMillis() - startTime));
        startTime = System.currentTimeMillis();
        for (int i = 0; i < arrayList.length(); i++) {
            arrayList.get(i);
        }
        System.out.println(String.format("Time For Getting: %d", System.currentTimeMillis() - startTime));
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 5000; i++) {
            arrayList.remove(4000);
        }
        System.out.println(String.format("Time For Removing: %d", System.currentTimeMillis() - startTime));
        System.out.println("------------------------------");

        System.out.println("SingleLinkedList");
        startTime = System.currentTimeMillis();
        SingleLinkedList<String> singleLinkedList = new SingleLinkedList<>();
        for (int i = 0; i < 10000; i++) {
            singleLinkedList.add("hi");
        }
        System.out.println(String.format("Time For Adding: %d", System.currentTimeMillis() - startTime));
        startTime = System.currentTimeMillis();
        for (int i = 0; i < singleLinkedList.length(); i++) {
            singleLinkedList.get(i);
        }
        System.out.println(String.format("Time For Getting: %d", System.currentTimeMillis() - startTime));
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 5000; i++) {
            singleLinkedList.remove(4000);
        }
        System.out.println(String.format("Time For Removing: %d", System.currentTimeMillis() - startTime));
        System.out.println("------------------------------");

        System.out.println("DoubleLinkedList");
        startTime = System.currentTimeMillis();
        DoubleLinkedList<String> doubleLinkedList = new DoubleLinkedList<>();
        for (int i = 0; i < 10000; i++) {
            doubleLinkedList.add("hi");
        }
        System.out.println(String.format("Time For Adding: %d", System.currentTimeMillis() - startTime));
        startTime = System.currentTimeMillis();
        for (int i = 0; i < doubleLinkedList.length(); i++) {
            doubleLinkedList.get(i);
        }
        System.out.println(String.format("Time For Getting: %d", System.currentTimeMillis() - startTime));
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 5000; i++) {
            doubleLinkedList.remove(4000);
        }
        System.out.println(String.format("Time For Removing: %d", System.currentTimeMillis() - startTime));
        System.out.println("------------------------------");

        System.out.println("CircularLinkedList");
        startTime = System.currentTimeMillis();
        CircularLinkedList<String> circularLinkedList = new CircularLinkedList<>();
        for (int i = 0; i < 10000; i++) {
            circularLinkedList.add("hi");
        }
        System.out.println(String.format("Time For Adding: %d", System.currentTimeMillis() - startTime));
        startTime = System.currentTimeMillis();
        for (int i = 0; i < circularLinkedList.length(); i++) {
            circularLinkedList.get(i);
        }
        System.out.println(String.format("Time For Getting: %d", System.currentTimeMillis() - startTime));
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 5000; i++) {
            circularLinkedList.remove(4000);
        }
        System.out.println(String.format("Time For Removing: %d", System.currentTimeMillis() - startTime));
    }
}
