/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pamarin.chapter6;

import java.io.IOException;
import java.util.Set;

/**
 *
 * @author offie
 */
public class WebReaderTest {
    
    public static void main(String[] args) throws IOException {
        WebReader reader = new WebReader("https://facebook.com");
        Set<String> links = reader.getLinks();
        for (String link : links){
        System.out.println("link = " + link);
    }
    }   
}