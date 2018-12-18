package com.task_3;

import org.junit.Assert;
import org.junit.Test;

import java.util.NoSuchElementException;

public class CustomQueueTest {

    @Test
    public void addTest() {
        CustomQueue customQueue = new CustomQueue();

        customQueue.add(1);
        customQueue.add(2);
        customQueue.add(3);

        Assert.assertEquals(1, customQueue.poll());
        Assert.assertEquals(2, customQueue.poll());
        Assert.assertEquals(3, customQueue.poll());
    }

    @Test
    public void correctPeekTest() {
        CustomQueue customQueue = new CustomQueue();

        customQueue.add(1);
        customQueue.add(2);
        customQueue.add(3);

        Assert.assertEquals(1, customQueue.peek());
        Assert.assertEquals(1, customQueue.peek());
        Assert.assertEquals(1, customQueue.peek());
    }

    @Test
    public void emptyPeekTest() {
        CustomQueue customQueue = new CustomQueue();

        Assert.assertNull(customQueue.peek());
    }

    @Test
    public void correctElementTest() {
        CustomQueue customQueue = new CustomQueue();

        customQueue.add(1);
        customQueue.add(2);
        customQueue.add(3);

        Assert.assertEquals(1, customQueue.element());
        Assert.assertEquals(1, customQueue.element());
        Assert.assertEquals(1, customQueue.element());
    }

    @Test(expected = NoSuchElementException.class)
    public void emptyElementTest() {
        CustomQueue customQueue = new CustomQueue();

        customQueue.element();
    }


    @Test
    public void correctPollTest() {
        CustomQueue customQueue = new CustomQueue();

        customQueue.add(1);
        customQueue.add(2);
        customQueue.add(3);

        Assert.assertEquals(1, customQueue.poll());
        Assert.assertEquals(2, customQueue.poll());
        Assert.assertEquals(3, customQueue.poll());
    }

    @Test
    public void emptyPollTest() {
        CustomQueue customQueue = new CustomQueue();

        Assert.assertNull(customQueue.poll());
    }

    @Test
    public void correctRemoveTest() {
        CustomQueue customQueue = new CustomQueue();

        customQueue.add(1);
        customQueue.add(2);
        customQueue.add(3);

        Assert.assertEquals(1, customQueue.remove());
        Assert.assertEquals(2, customQueue.remove());
        Assert.assertEquals(3, customQueue.remove());
    }

    @Test(expected = NoSuchElementException.class)
    public void emptyRemoveTest() {
        CustomQueue customQueue = new CustomQueue();

        customQueue.remove();
    }

}
