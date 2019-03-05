package autocar;

public class Suv extends Car {
    private String tyresize;

    public Suv() {
    }

    public Suv(String tyresize) {
        this.tyresize = tyresize;
    }

    public Suv(String manufacturer, int enginecapacity, String tyresize) {
        super(manufacturer, enginecapacity);
        this.tyresize = tyresize;
    }

    public String getTyresize() {
        return tyresize;
    }

    public void setTyresize(String tyresize) {
        this.tyresize = tyresize;
    }
}
