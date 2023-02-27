package com.singleton.designpattern.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IOException {
        
        exampleSerialization();

    }
        private static  void exampleSerialization() throws FileNotFoundException, IOException, ClassNotFoundException {
            
            SimpleSingleton simplesingleton = SimpleSingleton.getInstance();
             ObjectOutputStream objectoutputstream = new ObjectOutputStream(new FileOutputStream("object.obj"));
            objectoutputstream.writeObject(simplesingleton);
             objectoutputstream.close();

             ObjectInputStream objectinputstream = new ObjectInputStream (new FileInputStream("object.obj"));
             SimpleSingleton    desieralizesimple = (SimpleSingleton) objectinputstream.readObject() ;
             objectinputstream.close();

                 System.out.println("object1 ---> " + simplesingleton.hashCode());
                System.out.println("object2 ---> " + desieralizesimple.hashCode());



                SerializableSingleton serializablesingleton = SerializableSingleton.getInstance();
                ObjectOutputStream objectoutputstream1 = new ObjectOutputStream(new FileOutputStream("object1.obj"));
               objectoutputstream.writeObject(serializablesingleton);
                objectoutputstream.close();
   
                ObjectInputStream objectinputstream1 = new ObjectInputStream (new FileInputStream("object1.obj"));
                SerializableSingleton    desieralizesimple1 = (SerializableSingleton) objectinputstream.readObject() ;
                objectinputstream.close();
   
                    System.out.println("object1 ---> " + serializablesingleton.hashCode());
                   System.out.println("object2 ---> " + desieralizesimple1.hashCode());





        }



    }

