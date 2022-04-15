package Test;

import bean.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarTest {
    public static void main(String[] args) {
        ApplicationContext ct = new ClassPathXmlApplicationContext("beans.xml");
        Car c = (Car)ct.getBean("car");
        c.print();
    }
}
