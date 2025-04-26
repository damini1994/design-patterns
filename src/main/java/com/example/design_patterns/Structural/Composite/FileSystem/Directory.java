package com.example.design_patterns.Structural.Composite.FileSystem;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {

    String directoryName;
    List<FileSystem> fileSystems;

    public Directory(String directoryName) {
        this.directoryName = directoryName;
        this.fileSystems = new ArrayList<>();
    }

    public void add(FileSystem fileSystem){
        fileSystems.add(fileSystem);
    }
    @Override
    public void ls() {
        System.out.println("Directory name is: "+directoryName);
        for (FileSystem fileSystem: fileSystems){
            fileSystem.ls();
        }
    }
}
