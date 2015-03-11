
package com.pamarin.chapter6;

import java.io.IOException;
import java.util.Set;


public class WebReaderTest {
    
    public static void main(String[] args) throws IOException {
        WebReader reader = new WebReader("https://facebook.com");
        Set<String> links = reader.getLinks();
        for (String link : links){
        System.out.println("link = " + link);
    }
    }   
}
