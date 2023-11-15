import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperty {
    public static void main(String[] args) {
        try {
            // load the properties file
            FileInputStream fis = new FileInputStream("abc.properties");
            Properties pr = new Properties();
            pr.load(fis);

            // read the data from properties file
            System.out.println(pr.getProperty("username"));
            System.out.println(pr.getProperty("password"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
