package com.company;

public class Singleton {
    private static Singleton object;
    private String value;

    private Singleton(String value){
        this.value = value;
    }

    public synchronized static Singleton getObject(String value){
        if(object == null){
            object = new Singleton(value);
        }
        return object;
    }

    public String getValue(){
        return value;
    }
}
