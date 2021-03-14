package com.company;

public class MyCustomArrayList implements CustomList {

    private Integer[] array;
    private int count;

    public MyCustomArrayList() {
        this.array = new Integer[10];
        this.count = 0;
    }

    @Override
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

    public void swap(int index1, int index2) {
        if (index1 >= count || index2 >= count) {
            System.out.println("Index out of bounds");
        } else {
            int replace = this.array[index1];
            this.array[index1] = this.array[index2];
            this.array[index2] = replace;
        }
    }

    public int size() {
        return count;
    }

    @Override
    public String toString() {
        String string = new String();
        for (int i = 0; i < this.array.length; i++) {
            string += String.valueOf(this.array[i]) + ", ";
        }
        return "MyCustomArrayList{" +
                "array=" + string +
                '}';
    }
}
