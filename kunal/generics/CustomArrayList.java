package oop.kunal.generics;

import java.util.ArrayList;

public class CustomArrayList {
    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num) {
        if(is_full()) {
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        int[] temp = new int[data.length*2];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean is_full() {
        return size == data.length;
    }

    public int remove() {
        int removed = data[--size];
        return removed;
    }

    public int get(int index) {
        return data[index];
    }

    public int size() {
        return size;
    }

    public void set(int index, int val) {
        data[index] = val;
    }

    public String toString() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(data[i]);
        }
        String ans = new String();
        for (int i = 0; i < size; i++) {
            ans = ans + " " + list.get(i);
        }
        return ans;
    }
}
