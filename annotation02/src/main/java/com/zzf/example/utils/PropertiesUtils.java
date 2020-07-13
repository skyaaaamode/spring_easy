package com.zzf.example.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesUtils {
    public static Object getByname(Class T,String filename,String index){
        Properties properties = new Properties();
        InputStream is = T.getClassLoader().getResourceAsStream(filename);
        try {
            properties.load(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String property = properties.getProperty(index);
        return property;
    }
}
