package study.example.datastructure.stack;

import study.example.datastructure.interface_form.StackInterface;
import study.example.datastructure.list.ArrayList;

import java.util.EmptyStackException;

public class StackExtendArrayList<E> extends ArrayList<E> implements StackInterface<E> {

    public StackExtendArrayList() {
        super();
    }

    public StackExtendArrayList(int capacity) {
        super(capacity);
    }

    @Override
    public E push(E item) {
        addLast(item);
        return item;
    }

    @Override
    public E pop() {
        int length = size();
        return (E) remove(length - 1);
    }

    @Override
    public E peek() {
        int length = size();
        if (length == 0) {
            throw new EmptyStackException();
        }

        return (E) get(length - 1);
    }

    @Override
    public int search(Object value) {
        int index = lastIndexOf(value);

        if (index >= 0) {
            return size() - index;
        }

        return -1;
    }

    @Override
    public boolean empty() {
        return size() == 0;
    }
}
