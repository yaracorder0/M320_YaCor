package V1;

import java.util.ArrayList;
import java.util.Iterator;

public class StackTest<T> implements Iterator<T> {
    private ArrayList<T> elements;
    private int currentIndex;

    public StackTest() {
        this.currentIndex = 0;
        this.elements = new ArrayList<>();
    }

    // add element to stack
    public void push(T element) {
        elements.add(element);
    }

    // removes the last added element in stack
    public T pop() {
        return elements.removeLast();
    }


    // checks if there are more elements to iterate through (true/false)
    @Override
    public boolean hasNext() {
        return currentIndex < elements.size();
    }

    // gets the current element and increments the index
    @Override
    public T next() {
        return elements.get(currentIndex++);
    }

    // remove last element which it iterated through
    @Override
    public void remove() {
        elements.remove(--currentIndex);
    }


}
