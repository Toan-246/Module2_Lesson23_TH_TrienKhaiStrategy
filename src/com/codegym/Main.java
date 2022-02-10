package com.codegym;

public class Main {

    public static void main(String[] args) {
        SortedList sortedList = new SortedList();

        sortedList.add("abc");
        sortedList.add("deg");
        sortedList.add("hkj");

        sortedList.setSortStrategy(new MergeSort());
        sortedList.sort();

        sortedList.setSortStrategy(new SelectionSort());
        sortedList.sort();
    }
}
