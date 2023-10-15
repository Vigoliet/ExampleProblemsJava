package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

    public static void main(String[] args) {

            Queue <Integer> queue = new LinkedList<>();

            queue.offer(1);
            queue.offer(2);
            queue.offer(3);

            System.out.println("Queue: " + queue);

            int removedElement = queue.poll();

            System.out.println("Removed Element: " + removedElement);
            System.out.println("Queue after removal: " + queue);


    }
}
