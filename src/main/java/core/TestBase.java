package core;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class TestBase {
    private Properties properties;
    public TestBase() {


    }
    public void initializeProperties(){
        properties = new Properties();
        InputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream( System.getProperty("user.dir") + "\\src\\main\\resources\\generalConfiguration.properties");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            properties.load(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
