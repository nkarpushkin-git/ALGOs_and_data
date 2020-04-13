package Lesson_3.HomeWork;

import java.util.EmptyStackException;

public class MyDeck<Item> {
    private Item[] list;
    private int size = 0;
    private final int DEFAULT_CAPACITY = 10;

    private int begin = 0;
    private int end = 0;

    public MyDeck(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Bad size");
        }
        list = (Item[]) new Object[capacity];
    }

    public MyDeck() {
        list = (Item[]) new Object[DEFAULT_CAPACITY];
    }

    //метод вставки
    public void insertLeft(Item item) {
        if (isFull()) {
            throw new StackOverflowError();
        }
        size++;
        list[begin] = item;
        begin = nextIndex(begin);
    }

    public void insertRight(Item item) {
        if (isFull()) {
            throw new StackOverflowError();
        }
        size++;
        list[end] = item;
        end = nextIndex(end);
    }

    public Item removeLeft() {
        if (++begin > size) {
            begin = 0;
        }
        Item value = peekLeft();
        size--;
        list[begin] = null;
        begin = nextIndex(begin);
        return value;
    }

    public Item removeRight() {
        if (--end < 0) end = size-1;
        Item value = peekRight();
        size--;
        list[size] = null;
        end = beforeIndex(size);
        return value;
    }

    private int nextIndex(int index) {
        return (index + 1) % list.length;
    }

private int beforeIndex(int index) {
        return (index - 1) % list.length;
    }

    private Item peekLeft() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list[begin];
    }

    private Item peekRight() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list[size - 1];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == list.length;
    }


}
