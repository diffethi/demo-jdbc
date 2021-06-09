package fr.diginamic.props;

import org.apache.commons.configuration2.Configuration;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.configuration2.ex.ConfigurationException;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ResourceBundle;

public class TestConfigurationProps {
    public static void main(String[] args) {

        ResourceBundle config= ResourceBundle.getBundle("file");
        String data=config.getString("name");
        System.out.println(data);

        Enumeration<String> key = config.getKeys();
        while (key.hasMoreElements()) {
            String cle = key.nextElement();
            String value = config.getString(cle);
            System.out.println(cle + ": " + value);
        }



        }}








