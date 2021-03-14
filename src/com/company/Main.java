package com.company;

public class Main {

    public static void main(String[] args) {

        MyCustomSetList customSetList = new MyCustomSetList();
        customSetList.add(1);
        customSetList.add(2);
        customSetList.add(3);
        customSetList.add(4);
        customSetList.add(5);
        customSetList.add(6);
        customSetList.add(7);
        customSetList.add(8);
        customSetList.add(9);
        customSetList.add(10);
        customSetList.add(11);
        customSetList.add(12);

        System.out.println(customSetList);

        System.out.println(customSetList.size());

        int[] addList = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 12, 21, 4, 8, 4, 9, 22, 3};

        customSetList.checkUniqueAndAddArray(addList);

        System.out.println(customSetList);

        System.out.println(customSetList.size());

        CustomQueue customQueue = new CustomQueue();
        customQueue.add(1);
        customQueue.add(2);
        customQueue.add(3);
        customQueue.add(4);
        customQueue.add(5);
        System.out.println(customQueue);
        System.out.println(customQueue.poll());
        System.out.println(customQueue);
        System.out.println(customQueue.peek());
        System.out.println(customQueue);
    }
}
