package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 1/10/18.
 */

//Given
//When
//Then
public class SinglyLinkedListTest {

    @Test
    public void addNodeTest() {
        //Given:
        SinglyLinkedList<Integer> singLL = new SinglyLinkedList<Integer>();

        //When:
        singLL.addNode(3);
        singLL.addNode(6);
        singLL.addNode(9);

        //Then:
        Assert.assertEquals(3, singLL.size());
    }

    @Test
    public void removeNodeTest() {
        //Given
        SinglyLinkedList<Integer> singLL = new SinglyLinkedList<Integer>();
        singLL.addNode(3);
        singLL.addNode(6);
        singLL.addNode(9);
        //When
        singLL.removeNode(0);
        //Then
        Assert.assertEquals(2, singLL.size());
    }

    @Test
    public void removeFirstNode() {
        //Given
        SinglyLinkedList<Integer> singLL = new SinglyLinkedList<Integer>();
        singLL.addNode(3);
        singLL.addNode(6);
        singLL.addNode(9);
        //When
        singLL.removeNode(0);
        //Then
        Assert.assertEquals(2, singLL.size());
    }

}
