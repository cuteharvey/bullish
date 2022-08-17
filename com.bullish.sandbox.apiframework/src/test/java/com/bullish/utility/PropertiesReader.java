package com.bullish.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {

    static Properties properties;
    static String FILE_PATH;

    static  {
        FILE_PATH = "src/test/resources/properties/configurations.properties";


        FileInputStream input;

        try {
            input = new FileInputStream(FILE_PATH);
            properties = new Properties();
            properties.load(input);
            input.close();
        } catch (IOException e) {
            System.out.println("File not found");
        }

    }

    public static String getPropertiesValue (String propertyName) {
        System.out.println(propertyName);
        System.out.println(properties.getProperty(propertyName));
        return properties.getProperty(propertyName);
    }


}
