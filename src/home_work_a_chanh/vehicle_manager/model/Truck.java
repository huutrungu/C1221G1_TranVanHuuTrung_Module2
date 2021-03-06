package home_work_a_chanh.vehicle_manager.model;


public class Truck extends Vehicle {
    Double tonnage;

    public Truck() {
    }

    public Truck(String licensePlate, Manufacturer manufacturer, int manufacturerYear, String owner, Double tonnage) {
        super(licensePlate, manufacturer, manufacturerYear, owner);
        this.tonnage = tonnage;
    }

    public Double getTonnage() {
        return tonnage;
    }

    public void setTonnage(Double tonnage) {
        this.tonnage = tonnage;
    }

    @Override
    public String toString() {
        return "Truck{" +
                super.toString() +
                "tonnage=" + tonnage +
                '}';
    }
}
