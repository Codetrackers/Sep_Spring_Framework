package sep;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import sep.ConfigApp;

public class SepApp {
    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigApp.class);

        Java java = container.getBean(Java.class);

        java.getTeachingHours();
    }
}
