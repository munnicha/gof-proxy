package com.munnicha.patterns.gof.structural.proxy;

import com.munnicha.patterns.gof.structural.proxy.model.Image;
import com.munnicha.patterns.gof.structural.proxy.model.ProxyImage;

/**
 *
 * @author munnicha
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Image img=new ProxyImage("football.jpg");
        System.out.println("Setup proxy, image not loaded yet.");
        System.out.println("Do business logic...");
        System.out.println("Load the image only when it should appear.");
        //
        img.display(); //requested and loaded
        img.display(); //requested but not loaded
    }
    
}
