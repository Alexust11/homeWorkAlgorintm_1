package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.random.RandomGenerator;

public class StringListImpl implements StringList {
    private final List<String> stringList=new ArrayList<>();
    @Override
    public String add(String item) {
        stringList.add(item);
        return item;
    }

    @Override
    public String add(int index, String item) {
        if (index > stringList.size()) {throw new IllegalArgumentException("Индекс превышает зармер массива"); }
        else  stringList.add(index, item);
        return stringList.get(index);
    }

    @Override
    public String set(int index, String item) {
        if (index > stringList.size()) {throw new IllegalArgumentException("Индекс превышает зармер массива"); } else
            stringList.set(index, item);
        return stringList.get(index);

    }

    @Override
    public String remove(String item) {
      return null;
        }

    @Override
    public String remove(int index) {
        return null;
    }

    @Override
    public boolean contains(String item) {
        return false;
    }

    @Override
    public int indexOf(String item) {
        return 0;
    }

    @Override
    public int lastIndexOf(String item) {
        return 0;
    }

    @Override
    public String get(int index) {
        return null;
    }

    @Override
    public boolean equals(StringList otherList) {
        return false;
    }

    @Override
    public int size() {
        return stringList.size();
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public String[] toArray() {
        return new String[0];
    }
    public void getAll() {
        stringList.stream().forEach(System.out::println);
    }

}
