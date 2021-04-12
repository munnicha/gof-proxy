package com.munnicha.patterns.gof.structural.proxy.test;

import com.munnicha.patterns.gof.structural.proxy.model.Image;
import com.munnicha.patterns.gof.structural.proxy.model.ProxyImage;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author munnicha
 */
public class ProxyTest {
    
    @Test
    public void testProxy(){
        Image img=new ProxyImage("football.jpg");
        img.display(); //requested and loaded
        img.display(); //requested but not loaded
        
        //assert
        ProxyImage pImg=(ProxyImage)img; //for demo purposes
        assertEquals(pImg.getNumOfLoads(),1);
        assertEquals(pImg.getNumOfRequested(),2);
    }
    
}
