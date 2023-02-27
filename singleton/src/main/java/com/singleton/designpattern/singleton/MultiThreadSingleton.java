package com.singleton.designpattern.singleton;

public class MultiThreadSingleton {
    private static MultiThreadSingleton instance = null ;

    private  MultiThreadSingleton (){

    }

    public static MultiThreadSingleton getInstance() {
   if (instance == null) {
     synchronized (MultiThreadSingleton.class){
        if (instance == null) {
            instance = new MultiThreadSingleton();
        }



     }


   }

    return instance;
}
}
// object into byte form with wise version => serialization / deserialization