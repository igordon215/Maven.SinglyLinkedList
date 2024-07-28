package com.zipcodewilmington.singlylinkedlist;

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
}
