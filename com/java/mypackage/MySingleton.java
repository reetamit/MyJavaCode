package com.java.mypackage;

public class MySingleton {

    static MySingleton instance = null;
    public int x = 10;
    
    // private constructor can't be accessed outside the class
    private MySingleton() {  }
   
    // Factory method to provide the users with instances
    static public MySingleton getInstance()
    {
        if (instance == null)        
             instance = new MySingleton();
   
        return instance;
    } 
}
