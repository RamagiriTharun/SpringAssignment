package Test;

import bean.Cat;
import bean.Color;
import bean.Dog;
import config.DogCatConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DogTest {
    public static void main(String[] args) {
        ApplicationContext ct = new AnnotationConfigApplicationContext(DogCatConfig.class);

        Dog d = (Dog) ct.getBean("dog",Dog.class);
        d.setDog_name("Shero");
        d.setBreed_name("pomeranian");
        d.setOwner_name("Rahul");
        Color color = (Color) ct.getBean("color",Color.class);
        color.setBase_color("white");
        color.setTexture_color("brown");
        d.show();

        Cat c = (Cat) ct.getBean("cat",Cat.class);
        c.setCat_name("lil");
        c.setBreed_name("unknown");
        c.setOwner_name("Mark");
        Color color1 = (Color) ct.getBean("color",Color.class);
        color1.setBase_color("black");
        color1.setTexture_color("brownish");
        c.show();
    }
}
