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

    @Test
    public void findStringTest() {
        //Given
        SinglyLinkedList<String> singLL = new SinglyLinkedList<String>();
        singLL.addNode("Goku");
        singLL.addNode("Gohan");
        singLL.addNode("Roshi");
        singLL.addNode("Vegeta");
        singLL.addNode("Krillin");
        singLL.addNode("Piccolo");
        //When
        int expected = 3;
        int actual = singLL.find("Vegeta");
        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void notInStringTest() {
        //Given
        SinglyLinkedList<String> singLL = new SinglyLinkedList<String>();
        singLL.addNode("Goku");
        singLL.addNode("Gohan");
        singLL.addNode("Roshi");
        singLL.addNode("Vegeta");
        singLL.addNode("Krillin");
        singLL.addNode("Piccolo");
        //When
        int expected = -1;
        int actual = singLL.find("Cell");
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getTest() {
        //Given
        SinglyLinkedList<String> singLL = new SinglyLinkedList<String>();
        singLL.addNode("Goku");
        singLL.addNode("Gohan");
        singLL.addNode("Roshi");
        singLL.addNode("Vegeta");
        singLL.addNode("Krillin");
        singLL.addNode("Piccolo");
        //When
        String expected = "Piccolo";
        String actual = singLL.get(5);
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNullTest() {
        //Given
        SinglyLinkedList<String> singLL = new SinglyLinkedList<String>();
        singLL.addNode("Goku");
        singLL.addNode("Gohan");
        singLL.addNode("Roshi");
        singLL.addNode("Vegeta");
        singLL.addNode("Krillin");
        singLL.addNode("Piccolo");
        //When
        String expected = null;
        String actual = singLL.get(6);
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void copyTest() {
        //Given
        SinglyLinkedList<String> singLL = new SinglyLinkedList<String>();
        singLL.addNode("Goku");
        singLL.addNode("Gohan");
        singLL.addNode("Roshi");
        singLL.addNode("Vegeta");
        singLL.addNode("Krillin");
        singLL.addNode("Piccolo");
        //When
        SinglyLinkedList<String> copy = singLL.copy(singLL);
        String expected = singLL.get(1);
        String actual = copy.get(1);
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sortTest() {
        //Given
        SinglyLinkedList<String> singLL = new SinglyLinkedList<String>();
        singLL.addNode("Goku");
        singLL.addNode("Gohan");
        singLL.addNode("Roshi");
        singLL.addNode("Vegeta");
        singLL.addNode("Krillin");
        singLL.addNode("Piccolo");
        //When
        SinglyLinkedList<String> sortList = singLL.sort(singLL);
        String expected = "Piccolo";
        String actual = sortList.get(3);
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sortIntegerTest() {
        //Given
        SinglyLinkedList<Integer> singLL = new SinglyLinkedList<Integer>();
        singLL.addNode(16);
        singLL.addNode(120);
        singLL.addNode(8);
        singLL.addNode(3);
        singLL.addNode(29);
        singLL.addNode(265);
        singLL.addNode(97);
        singLL.addNode(155);
        //When
        SinglyLinkedList<Integer> sortList = singLL.sort(singLL);
        int expected = 97;
        int actual = sortList.get(4);
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void reverseTest() {
        //Given
        SinglyLinkedList<Integer> singLL = new SinglyLinkedList<Integer>();
        singLL.addNode(16);
        singLL.addNode(120);
        singLL.addNode(8);
        singLL.addNode(3);
        singLL.addNode(29);
        singLL.addNode(265);
        singLL.addNode(97);
        singLL.addNode(155);
        //When
        SinglyLinkedList<Integer> sortList = singLL.reverse(singLL);
        int expected = 155;
        int actual = sortList.get(0);
        //Then
        Assert.assertEquals(expected, actual);
    }




}
