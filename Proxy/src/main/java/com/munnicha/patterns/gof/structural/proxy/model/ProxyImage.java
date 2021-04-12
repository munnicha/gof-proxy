package com.munnicha.patterns.gof.structural.proxy.model;

/**
 *
 * @author munnicha
 */
public class ProxyImage implements Image{
    
    private String fileName;
    private RealImage realImg;
    private int numOfRequested=0; //for demo purposes
    private int numOfLoads=0; //for demo purposes

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }
    
    @Override
    public void display() {
        this.numOfRequested+=1;
       if(realImg==null){
           realImg=new RealImage(fileName);
           this.numOfLoads+=1;
       }
       realImg.display();
    }

    public int getNumOfRequested() {
        return numOfRequested;
    }

    public int getNumOfLoads() {
        return numOfLoads;
    }  

}
