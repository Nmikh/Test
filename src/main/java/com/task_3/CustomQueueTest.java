package com.task_3;

public class CustomQueueTest {
    public static void main(String[] args) {

        CustomQueue customQueue = new CustomQueue();

        customQueue.add(1);
        customQueue.add(2);
        customQueue.add(3);
        customQueue.add(4);
        customQueue.add(5);

        Integer poll1 = (Integer) customQueue.poll();
        Integer poll2 = (Integer) customQueue.poll();

        System.out.println(poll1);
        System.out.println(poll2);

        customQueue.add(6);
        customQueue.add(7);

        poll1 = (Integer) customQueue.peek();
        poll2 = (Integer) customQueue.peek();

        System.out.println(poll1);
        System.out.println(poll2);

        poll1 = (Integer) customQueue.poll();
        poll2 = (Integer) customQueue.poll();

        System.out.println(poll1);
        System.out.println(poll2);
    }
}
