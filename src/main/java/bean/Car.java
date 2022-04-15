package bean;

public class Car {
    private String company;
    private String model;
    Vehicle vehicle;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void print(){
        System.out.println("--------Car details------");
        System.out.println("company: " + company);
        System.out.println("model: "+ model);
        vehicle.print();
    }
}
