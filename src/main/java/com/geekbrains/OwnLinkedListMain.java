package com.geekbrains;

import java.util.LinkedList;

public class OwnLinkedListMain {
    public static void main(String[] args) {
        OwnLinkedList<Integer> integerOwnLinkedList = new OwnLinkedList<>();
        integerOwnLinkedList.addNode(150);
        integerOwnLinkedList.addNode(347);
        integerOwnLinkedList.addNode(111);
        integerOwnLinkedList.addNode(789);
        integerOwnLinkedList.addNode(222);
        integerOwnLinkedList.addNode(345);
        integerOwnLinkedList.addToIndex(45,3);
        integerOwnLinkedList.deleteToIndex(2);
        integerOwnLinkedList.display();
        integerOwnLinkedList.display(0);

        Integer[] arr = {150, 347, 111};
        System.out.println(arr[1]);
    }

}
