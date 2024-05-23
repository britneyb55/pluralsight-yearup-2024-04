package com.pluralsight.models;

import java.util.List;
import java.util.ArrayList;

public class FixedList<T>
{
    private List<T> items;
    private int maxSize;

    public FixedList(int maxSize) {
        this.items = new ArrayList<>();
        this.maxSize = maxSize;
    }

    public int getMaxSize()
    {
        return maxSize;
    }


    public void add(T item)
    {
        if (items.size() < maxSize)
        {
            items.add(item);
        }

    }

    public List<T> getItems()
    {
        return items;
    }



}
