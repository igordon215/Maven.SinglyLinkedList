package com.zipcodewilmington.singlylinkedlist;

import java.net.BindException;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList<Type extends Comparable<Type>> {
    public Node<Type> head = null;
    public Node<Type> tail = null;

    public void addNode(Type data) {
        Node<Type> newNode = new Node<Type>(data);

        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
    }


    public int size() {
        int counter = 0;
        Node<Type> current = head;

        while (current != null) {
            System.out.println(current.data);
            current = current.next;
            counter++;
        }
        return counter;
    }

    public void removeNode(int index) {
        if (index == 0 && head.next != null) {
            head = head.next;
        }

        if (index == 0 && head.next == null) {
            head = null;
        }

        Node<Type> current = head;
        Node<Type> previous = head;
        int counter = 0;

        while (current != null && counter != index) {
            previous = current;
            current = current.next;
            counter++;
        }
        if (head != null) {
            previous.next = current.next;
        }
    }

    public boolean contains(Type element) {
        Node<Type> current = head;

        while (current != null) {
            if (current.data.equals(element)) {return true;}
                current = current.next;
        }
        return false;
    }

    public int find(Type element) {
        int counter = 0;
        Node<Type> current = head;

        while(current != null && !current.data.equals(element)) {
            current = current.next;
            counter++;
        }
        if(current == null) {
            return -1;
        } else return counter;
    }
}
