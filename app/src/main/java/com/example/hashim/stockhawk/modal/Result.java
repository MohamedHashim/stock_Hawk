package com.example.hashim.stockhawk.modal;
/**
 * Created by Mohamed Hashim on 15/10/2016.
 */
public class Result
{
    private Query query;

    public Query getQuery ()
    {
        return query;
    }


    public void setQuery (Query query)
    {
        this.query = query;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [query = "+query+"]";
    }
}
