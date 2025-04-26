package com.example.design_patterns.Structural.Composite.FileSystem;

public class Main {
    public static void main(String[] args) {
        Directory directory = new Directory("Movie");
        FileSystem file = new File("IRON MAN");
        directory.add(file);

        Directory newDirectory = new Directory("Comedy");
        FileSystem file1 = new File("FRIENDS");
        newDirectory.add(file1);

        directory.add(newDirectory);
        directory.ls();
    }
}
//OUTPUT

//Directory name is: Movie
//Filename is: IRON MAN
//Directory name is: Comedy
//Filename is: FRIENDS
