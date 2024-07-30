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
        //System.out.println(singLL);
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
        //System.out.println(singLL);
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
        //System.out.println(singLL);
        Assert.assertEquals(2, singLL.size());
    }

    @Test
    public void removeLastNode() {
        //Given
        SinglyLinkedList<Integer> singLL = new SinglyLinkedList<Integer>();
        singLL.addNode(3);
        singLL.addNode(6);
        singLL.addNode(9);
        //When
        singLL.removeNode(2);
        //Then
        //System.out.println(singLL);
        Assert.assertEquals(2, singLL.size());
    }

    @Test
    public void removeNodeNullTest() {
        //Given
        SinglyLinkedList<Integer> singLL = new SinglyLinkedList<Integer>();
        singLL.addNode(3);
        //When
        singLL.removeNode(0);
        //Then
        Assert.assertEquals(0, singLL.size());
    }

    @Test
    public void containsTest() {
        //Given
        SinglyLinkedList<Integer> singLL = new SinglyLinkedList<Integer>();
        singLL.addNode(3);
        singLL.addNode(6);
        singLL.addNode(9);
        //When
        boolean actual = singLL.contains(9);
        //Then
        Assert.assertTrue(singLL.contains(9));
    }

    @Test
    public void ContainsNodeFalseTest() {
        //Given
        SinglyLinkedList<Integer> singLL = new SinglyLinkedList<Integer>();
        singLL.addNode(3);
        singLL.addNode(6);
        singLL.addNode(9);
        //When
        boolean actual = singLL.contains(11);
        //Then
        Assert.assertFalse(actual);
    }

    @Test
    public void findTest() {
        //Given
        SinglyLinkedList<Integer> singLL = new SinglyLinkedList<Integer>();
        singLL.addNode(3);
        singLL.addNode(6);
        singLL.addNode(9);
        //When
        int expected = 2;
        int actual = singLL.find(9);
        //Then
        Assert.assertEquals(expected, actual);

    }


}
