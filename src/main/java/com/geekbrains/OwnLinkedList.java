package com.geekbrains;

import javax.swing.*;

public class OwnLinkedList<T> {
    private long size;
    private Node head;
    private Node tail;

    public OwnLinkedList() {
        this.size = 0;
        this.head = null;
        this.tail = null;
    }

    public void addNode(T data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
        }

        tail = newNode;
        size++;
    }

    public void display() {
        Node current = head;

        if (head == null) {
            System.out.println("Односвязный список пуст");
            return;
        }

        while (current != null) {
            System.out.println(current.data + " ");
            current = current.next;
        }

        System.out.println();
    }

    public void display(int index) {
        if (index > size) {
            System.out.println("Размер списка больше чем заданный индекс");
            return;
        }

        Node current = head;

        for (int i = 1; i <= index; i++) {
            current = current.next;
        }

        System.out.println(current.data);
    }

    public void addToIndex(T data, int index){
        Node newNode = new Node(data);
        Node current = head;
        int lenght = 1;

        while (head.next != null){
            if (index == lenght++){
                newNode.next = current.next;
                current.next = newNode;
                return;
            }
            current = current.next;
        }

        /*for (int i = 0; i <= index; i++){
            if (i == 0){
                current = head;
            } else {
                current = current.next;
            }
            if (i == index){
                current = newNode;
                tail.next = current;
            }
            tail = current;
        }*/
    }

    public void deleteToIndex(int index){
        Node current = head;
        int lenght = 1;

        while (current.next != null){
            if (index == lenght++){
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }


    private class Node {
        T data;
        Node next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

}
