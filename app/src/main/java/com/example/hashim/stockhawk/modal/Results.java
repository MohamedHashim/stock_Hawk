package com.example.hashim.stockhawk.modal;

/**
 * Created by Mohamed Hashim on 21/10/2016.
 */
public class Results
{
    private Quote[] quote;

    public Quote[] getQuote ()
    {
        return quote;
    }

    public void setQuote (Quote[] quote)
    {
        this.quote = quote;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [quote = "+quote+"]";
    }
}

