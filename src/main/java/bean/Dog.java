package bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dog {
    private String dog_name;
    private String owner_name;
    private String breed_name;
    @Autowired
    Color color;

    public String getDog_name() {
        return dog_name;
    }

    public void setDog_name(String dog_name) {
        this.dog_name = dog_name;
    }

    public String getOwner_name() {
        return owner_name;
    }

    public void setOwner_name(String owner_name) {
        this.owner_name = owner_name;
    }

    public String getBreed_name() {
        return breed_name;
    }

    public void setBreed_name(String breed_name) {
        this.breed_name = breed_name;
    }

    public void show(){
        System.out.println("----------Dog details------------");
        System.out.println("Dog name: "+getDog_name());
        System.out.println("Owner name: "+getOwner_name());
        System.out.println("Breed name: "+getBreed_name());
        System.out.println("Color");
        color.print();
    }
}
