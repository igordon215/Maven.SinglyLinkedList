package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {

    @Test
    public void addNodeTest() {
        //Given:
        SinglyLinkedList<Integer> singLL = new SinglyLinkedList<Integer>();

        //When:
        singLL.addNode(5);
        singLL.addNode(2);
        singLL.addNode(3);

        //Then:
        Assert.assertEquals(3, singLL.size());
    }


}
