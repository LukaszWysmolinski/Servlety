package pl.sdacademy.userdb;

import org.apache.catalina.startup.Tomcat;
import pl.sdacademy.userdb.tomcat.EmbeddedTomcatFactory;

public class Main {
    public static void main(String[] args) throws Exception {

        Tomcat tomcat = EmbeddedTomcatFactory.create(8080);
        tomcat.start();
        tomcat.getServer().await();

    }
}
