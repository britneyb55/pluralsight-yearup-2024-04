package com.pluralsight.models;

import com.pluralsight.models.interfaces.Valuable;

import java.util.ArrayList;
import java.util.List;

public class Portfolio implements Valuable
{
    private String fristName;
    private String owner;
    private List<Valuable> valuable;

    public Portfolio( String firstName, String owner) {
        this.fristName = firstName;
        this.owner = owner;
        this.valuable = new ArrayList<>();
    }

    public void add(Valuable asset)
    {
        valuable.add(asset);

    }

    public double getValue()
    {
        double total= 0.0;

        for(Valuable asset:valuable)
        {
            total += asset.getValue();
        }
        return total;
    }

}
