package com.company;

import java.util.Arrays;

public class MyCustomSetList implements CustomList {

    private Integer[] array;
    private int count;

    public MyCustomSetList() {
        this.array = new Integer[10];
        this.count = 0;
    }

    @Override
    public void add(int num) {
        boolean check = false;
        for (int i = 0; i < this.count; i++) {
            if (num == this.array[i]) {
                check = true;
            }
        }
        if (!check) {
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
    }

    @Override
    public void remove(int index) {
        if (index >= count) {
            System.out.println("Index out of bounds");
        } else {
            for (int i = index; i < count - 1; i++) {
                this.array[i] = this.array[i + 1];
            }
            this.array[count - 1] = null;
            count--;
        }
    }

    @Override
    public void swap(int index1, int index2) {
        if (index1 >= count || index2 >= count) {
            System.out.println("Index out of bounds");
        } else {
            int replace = this.array[index1];
            this.array[index1] = this.array[index2];
            this.array[index2] = replace;
        }
    }

    @Override
    public int size() {
        return this.count;
    }

    public void checkUniqueAndAddArray(int[] addArray) {
        for (int i = 0; i < addArray.length; i++) {
            boolean check = true;
            for (int j = 0; j < this.count; j++) {
                if (addArray[i] == this.array[j]) {
                    check = false;
                }
            }
            if (check) {
                if (this.count >= this.array.length) {
                    Integer[] copyArray = new Integer[this.array.length + 10];
                    for (int k = 0; k < this.array.length; k++) {
                        copyArray[k] = this.array[k];
                    }
                    this.array = copyArray;
                }
                this.array[count] = addArray[i];
                count++;
            }
        }
    }

    @Override
    public String toString() {
        return "MyCustomSetList{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
