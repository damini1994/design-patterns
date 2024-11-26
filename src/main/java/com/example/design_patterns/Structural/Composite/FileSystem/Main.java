package com.example.design_patterns.Structural.Composite.FileSystem;

public class Main {
    public static void main(String[] args) {
        FileSystemComponent file1 = new File("file1.txt");
        FileSystemComponent file2 = new File("file2.jpg");

        Folder folder1 = new Folder("Folder1");
        Folder folder2 = new Folder("Folder2");

        folder1.addComponent(file1);
        folder2.addComponent(file2);

        Folder rootFolder = new Folder("RootFolder");
        rootFolder.addComponent(folder1);
        rootFolder.addComponent(folder2);

        rootFolder.showDetails();
    }
}
