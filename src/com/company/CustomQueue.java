package com.company;

import java.util.Arrays;

public class CustomQueue {

    private Integer[] array;
    private int count;

    public CustomQueue() {
        this.array = new Integer[10];
        this.count = 0;
    }

    public void add(int num) {
        if (this.count >= this.array.length) {
            Integer[] copyArray = new Integer[this.array.length + 10];
            for (int i = 0; i < this.array.length; i++) {
                copyArray[i] = this.array[i];
            }
            this.array = copyArray;
        }
        this.array[count] = num;
        count++;
    }

    public Integer poll() {
        return this.array[count - 1];
    }

    public Integer peek() {
        Integer last = this.array[count - 1];
        this.array[count - 1] = null;
        count--;
        return last;
    }

    public int size() {
        return count;
    }

    @Override
    public String toString() {
        return "CustomQueue{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
