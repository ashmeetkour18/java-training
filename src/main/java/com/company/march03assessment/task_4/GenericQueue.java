package com.company.march03assessment.task_4;

import java.util.*;

public class GenericQueue<E> {
    private final List<E> list = new LinkedList<>();

    public void add(E element) {
        list.add(element);
    }

    public E removeElement() {
        if (isEmpty())
            return null;
        E firstElement = list.get(0);
        list.remove(firstElement);
        return firstElement;
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int getSize() {
        return list.size();
    }

    @Override
    public String toString() {
        return list.toString();
    }
}

class Question4 {
    public static void main(String[] args) {
        GenericQueue<Integer> genericQueue = new GenericQueue<>();
        System.out.println(genericQueue.isEmpty());
        genericQueue.add(1);
        genericQueue.add(5);
        genericQueue.add(10);
        genericQueue.add(7);
        genericQueue.add(9);
        System.out.println(genericQueue);
        System.out.println(genericQueue.removeElement());
        System.out.println(genericQueue.getSize());
        System.out.println(genericQueue);
    }
}


