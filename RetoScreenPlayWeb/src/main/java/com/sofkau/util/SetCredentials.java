package com.sofkau.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class SetCredentials {

    public static List<String> getEmailPasword() throws IOException {
        List<String> credentials = new ArrayList<>();
        Properties prop = new Properties();
        prop.load(new FileInputStream(new File("src/test/resources/file.properties")));
        credentials.add(prop.getProperty("EMAIL"));
        credentials.add(prop.getProperty("PASSWORD"));
        return credentials;
    }
}
