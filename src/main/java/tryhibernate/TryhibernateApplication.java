package tryhibernate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class TryhibernateApplication {

    public static void main(String[] args) {
        SpringApplication.run(TryhibernateApplication.class, args);
    }

}
