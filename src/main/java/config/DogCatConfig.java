package config;

import bean.Cat;
import bean.Color;
import bean.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DogCatConfig {

    @Bean(name = "dog")
    public Dog getDog(){
        return new Dog();
    }

    @Bean(name = "cat")
    public Cat getCat(){
        return new Cat();
    }

    @Bean(name = "color")
    public Color getColor(){
        return new Color();
    }
}
