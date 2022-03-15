package tweete_assessment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;


@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class SpringExample {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringExample.class, args);
    }
}
