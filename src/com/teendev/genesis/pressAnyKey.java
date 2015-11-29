package com.teendev.genesis;

/**
 * Created by Adrian on 21.11.2015.
 */
public class pressAnyKey {
    public void main()
    {
        System.out.println("Naciśnij dowolny przycisk aby kontynuować...");
        try
        {
            System.in.read();
        }
        catch(Exception e)
        {}
    }
}
