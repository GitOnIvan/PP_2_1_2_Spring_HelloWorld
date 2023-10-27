import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
 
    @Bean(name="helloworld")

    public HelloWorld getHelloWorld() {

        return new HelloWorld();
    }
    @Bean(name ="beanCat")
    @Scope("prototype")
    public Cat getCat() {


        return new Cat();
    }
}