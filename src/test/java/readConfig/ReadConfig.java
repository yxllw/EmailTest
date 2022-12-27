package readConfig;

import java.io.IOException;

public class ReadConfig {
    static public String URL;
    static public String username;
    static public String password;
    static public String emailAddress;

    public static void loadConfig() throws IOException {
        System.getProperties().load(ClassLoader.getSystemResourceAsStream("config.properties"));
        URL = System.getProperty("url");
        username = System.getProperty("username");
        password = System.getProperty("password");
        emailAddress = System.getProperty("emailAddress");
    }
}
