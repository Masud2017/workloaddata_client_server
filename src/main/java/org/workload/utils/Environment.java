package org.workload.utils;

import com.google.common.io.Resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Environment {
    private Properties prop;
    private File propFile;

    public Environment () throws IOException {
        this.propFile = new File(Resources.getResource("application.properties").getPath());
        this.prop = new Properties();
        FileInputStream fInp = new FileInputStream(this.propFile);
        this.prop.load(fInp);
    }

    public String getValue(String key) {
        return this.prop.getProperty(key);
    }

    public void setValue(String key,String value) {
        this.prop.setProperty(key,value);
    }
}
