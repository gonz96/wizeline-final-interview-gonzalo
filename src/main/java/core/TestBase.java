package core;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

public class TestBase {
    protected Properties properties;
    public TestBase() {
        FileInputStream fileInputStream = null;
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