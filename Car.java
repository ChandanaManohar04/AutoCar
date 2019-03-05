package autocar;

public class Car {
    private String manufacturer;
    private int enginecapacity;

    public Car() {
    }

    public Car(String manufacturer, int enginecapacity) {
        this.manufacturer = manufacturer;
        this.enginecapacity = enginecapacity;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getEnginecapacity() {
        return enginecapacity;
    }

    public void setEnginecapacity(int enginecapacity) {
        this.enginecapacity = enginecapacity;
    }
}
