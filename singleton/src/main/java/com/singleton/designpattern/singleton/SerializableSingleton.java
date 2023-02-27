package com.singleton.designpattern.singleton;

public class SerializableSingleton {
    private static SerializableSingleton instance = null;

    private SerializableSingleton() {
    }

    public static SerializableSingleton getInstance() {
        if (instance == null) {
            instance = new SerializableSingleton();
        }
        return instance;
    }

protected Object readResolve(){
return instance;

}



    
}
