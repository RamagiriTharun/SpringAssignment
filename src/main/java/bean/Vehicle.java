package bean;

public class Vehicle {
    private String vehicle_number;
    private String color;
    private String owner_name;

    public String getVehicle_number() {
        return vehicle_number;
    }

    public void setVehicle_number(String vehicle_number) {
        this.vehicle_number = vehicle_number;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOwner_name() {
        return owner_name;
    }

    public void setOwner_name(String owner_name) {
        this.owner_name = owner_name;
    }

    public void print(){
        System.out.println("--------Vehicle details-----");
        System.out.println("Vehicle number: " + vehicle_number);
        System.out.println("color: " +color);
        System.out.println("owner name: "+owner_name);
    }
}
