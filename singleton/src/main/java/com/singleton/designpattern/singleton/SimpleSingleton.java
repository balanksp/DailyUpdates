package com.singleton.designpattern.singleton;

public class SimpleSingleton {
    // create a variable 
    // same class is a instance is here.
    private static SimpleSingleton instance = null;

  // for initialize the variable.
  // no one can not create the instance for the class.
  private SimpleSingleton (){

  }

public static  SimpleSingleton getInstance() {
// return to the same instance
if (instance == null) {
    instance = new SimpleSingleton();
    
}
return instance;
}

// result should be in the same instance.

}
