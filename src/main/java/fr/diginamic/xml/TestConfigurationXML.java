package fr.diginamic.xml;

import org.apache.commons.configuration2.Configuration;
import org.apache.commons.configuration2.XMLConfiguration;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.configuration2.ex.ConfigurationException;

public class TestConfigurationXML {
    public static void main(String[] args) {
        Configurations configs = new Configurations();
        try {
            XMLConfiguration config = configs.properties("file.xml");
            String name = config.getString("admin.name");
            String url = config.getString("admin.url");
            String user = config.getString("admin.user");
            String password = config.getString("admin.password");
        } catch (ConfigurationException e) {
            e.printStackTrace();
        }

    }
}

