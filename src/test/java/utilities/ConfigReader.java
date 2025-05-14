package utilities;

import net.datafaker.Faker;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Locale;
import java.util.Properties;

public class ConfigReader {
    private static Properties properties = new Properties();
    static Faker dataFaker = new Faker(new Locale("en-US"));

    static {
        try {
            FileInputStream file = new FileInputStream("configuration.properties");
            properties.load(file);
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String keyword) {
        return properties.getProperty(keyword);
    }

    public static int getIntProperty(String keyword) {
        return Integer.parseInt(properties.getProperty(keyword));
    }

    public static void updateProperty(String keyword) {

        switch (keyword) {
            case "email":
                String email = dataFaker.internet().emailAddress();
                properties.setProperty(keyword, email);
                break;
            case "password":
                String password = dataFaker.regexify("[A-Z]{2}[a-z]{3}[0-9]{2}[@#]");
                properties.setProperty(keyword, password);
                break;
        }

        FileOutputStream outputFile = null;
        try {
            outputFile = new FileOutputStream("src/configuration.properties");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            properties.store(outputFile, null);
            outputFile.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
