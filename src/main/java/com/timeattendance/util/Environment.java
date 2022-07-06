/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.timeattendance.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Properties;

/**
 *
 * @author pool13433
 */
public class Environment {
        
    private Properties props = new Properties();
    
    public Environment(String filePath){
       try {
           InputStream stream = new FileInputStream(new File(filePath));
           InputStreamReader reader = new InputStreamReader(stream, StandardCharsets.UTF_8);
            props.load(reader);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public Properties getProps() {
        return props;
    }
}
