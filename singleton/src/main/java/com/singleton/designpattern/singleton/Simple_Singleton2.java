package com.singleton.designpattern.singleton;

public class Simple_Singleton2 {
    private static Simple_Singleton2 instance = new Simple_Singleton2();

    private Simple_Singleton2 (){

    }

    public Simple_Singleton2 getInstance() {

        return instance;
}

// here avoid the multiple threading problems 
// but use the objects not problem , 
//if not use then waste the memory.
}
