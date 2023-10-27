import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean1 = applicationContext.getBean("helloworld", HelloWorld.class);
        HelloWorld bean2 = applicationContext.getBean("helloworld", HelloWorld.class);



        Cat bean3 = applicationContext.getBean("beanCat", Cat.class);
        Cat bean4 = applicationContext.getBean("beanCat", Cat.class);



        System.out.println("Для класса HelloWorld " + (bean1==bean2));
        System.out.println("Для класса Cat " + (bean3==bean4));
    }
}