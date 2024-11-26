package com.example.design_patterns.Creational.Singleton.BreakSingleton;

import java.io.*;

public class SerializationSingletonMain {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        LazySingleton lazySingleton = LazySingleton.getInstance();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("obj.obj"));
        objectOutputStream.writeObject(lazySingleton);
        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("obj.obj"));
        LazySingleton deserializedObject = (LazySingleton) objectInputStream.readObject();
        objectInputStream.close();

        System.out.println("Object 1: "+ lazySingleton.hashCode());
        System.out.println("Object 2: "+ deserializedObject.hashCode());


        SerializationSingleton serializationSingleton = SerializationSingleton.getInstance();
        ObjectOutputStream objectOutputStream1 = new ObjectOutputStream(new FileOutputStream("obj.obj1"));
        objectOutputStream1.writeObject(serializationSingleton);
        objectOutputStream1.close();

        ObjectInputStream objectInputStream1 = new ObjectInputStream(new FileInputStream("obj.obj1"));
        SerializationSingleton deserializedObject1 = (SerializationSingleton) objectInputStream1.readObject();
        objectInputStream1.close();

        System.out.println("Serialize Object 1: "+ serializationSingleton.hashCode());
        System.out.println("Serialize Object 2: "+ deserializedObject1.hashCode());

    }
}
