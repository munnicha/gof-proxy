package com.munnicha.patterns.gof.structural.proxy.model;

/**
 *
 * @author munnicha
 */
public class RealImage implements Image{
    
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }
    
    private void loadFromDisk(String fileName){
        System.out.println("Load file "+fileName+" from disk.");
    }

    @Override
    public void display() {
        System.out.println("Display image.");
    }
    
}
